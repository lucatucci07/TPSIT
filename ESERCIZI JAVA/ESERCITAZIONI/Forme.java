class Forma {
    public String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("Il nome della forma è: " + nome);
    }
}

class Cerchio extends Forma {
    public double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}

class Rettangolo extends Forma {
    public double base, altezza;

    public Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Triangolo extends Forma {
    public double base, altezza, lato1, lato2, lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}

public class Forme {
    public static void main(String[] args) {
        Forma[] forme = {
            new Cerchio(5),
            new Rettangolo(4, 6),
            new Triangolo(3, 4, 3, 4, 5)
        };

        for (Forma f : forme) {
            f.descrizione();
            System.out.println("Area: " + f.calcolaArea());
            System.out.println("Perimetro: " + f.calcolaPerimetro());
        }
    }
}
00000