abstract class Figura2D {
    abstract double area();
    abstract double perimetro();
}

abstract class Figura3D {
    abstract double volume();
    abstract double superficie();
}

class Cerchio extends Figura2D {
    double r;
    Cerchio(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
    double perimetro() { return 2 * Math.PI * r; }
}

class Rettangolo extends Figura2D {
    double larg, alt;
    Rettangolo(double larg, double alt) {
        this.larg = larg;
        this.alt = alt;
    }
    double area() { return larg * alt; }
    double perimetro() { return 2 * (larg + alt); }
}

class Sfera extends Figura3D {
    double r2;
    Sfera(double r2) { this.r2 = r2; }
    double volume() { return (4.0 / 3) * Math.PI * Math.pow(r2, 3); }
    double superficie() { return 4 * Math.PI * r2 * r2; }
}

class Parallelepipedo extends Figura3D {
    double base, altezza, profondita;
    Parallelepipedo(double base, double altezza, double profondita) {
        this.base = base;
        this.altezza = altezza;
        this.profondita = profondita;
    }
    double volume() { return base * altezza * profondita; }
    double superficie() { return 2 * (base*altezza + base*profondita + altezza*profondita); }
}

public class es9 {
    public static void main(String[] args) {
        Figura2D cerchio = new Cerchio(6);
        Figura2D rettangolo = new Rettangolo(5, 7);
        Figura3D sfera = new Sfera(4);
        Figura3D parallelepipedo = new Parallelepipedo(3, 4, 5);

        System.out.println("Area del Cerchio -  " + cerchio.area() 
            + ", Perimetro: " + cerchio.perimetro());
        System.out.println("Area: del Rettangolo -  " + rettangolo.area() 
            + ", Perimetro: " + rettangolo.perimetro());
        System.out.println("Volume della sfera-" + sfera.volume() 
            + ", Superficie: " + sfera.superficie());
        System.out.println("Volume del Parallelepipedo-  " + parallelepipedo.volume() 
            + ", Superficie: " + parallelepipedo.superficie());
    }
}
