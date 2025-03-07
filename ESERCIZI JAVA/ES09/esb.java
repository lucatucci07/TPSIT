abstract class Forma {
    abstract double Area();
}

class Cerchio extends Forma {
    private double r;

    Cerchio(double r) {
        this.r = r;
    }

    @Override
    double Area() {
        return Math.PI * r * r;
    }
}

class Rett extends Forma {
    private double b, h;

    Rett(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double Area() {
        return b * h;
    }
}

public class esb {
    public static void main(String[] args) {
        Forma[] forme = {new Cerchio(30), new Rett(8, 9)};

        for (Forma forma : forme) {
            System.out.println("area della figura: " + forma.Area());
        }
    }
}
