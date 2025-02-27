abstract class Forma {
    abstract double calcolaArea();
}

class Cerchio extends Forma {
    private double raggio;

    Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}

class Rettangolo extends Forma {
    private double base, altezza;

    Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    double calcolaArea() {
        return base * altezza;
    }
}

public class esb {
    public static void main(String[] args) {
        Forma[] forme = {new Cerchio(30), new Rettangolo(8, 9)};

        for (Forma forma : forme) {
            System.out.println("area: " + forma.calcolaArea());
        }
    }
}
