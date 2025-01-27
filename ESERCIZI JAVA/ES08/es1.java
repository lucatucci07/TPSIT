class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public void stampaDettagli() {
        System.out.println("Marca del mezzo: " + marca + ", Modello del mezzo: " + modello);
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int numeroPorte) {
        super(marca, modello);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Numero di Porte: " + numeroPorte);
    }
}

class Moto extends Veicolo {
    private boolean haSidecar;

    public Moto(String marca, String modello, boolean haSidecar) {
        super(marca, modello);
        this.haSidecar = haSidecar;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Sidecar: " + (haSidecar ? "Sì" : "No"));
    }
}

public class es1 {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford", "Focus", 5);
        Moto moto = new Moto("Harley-Davidson", "Softail", false);

        auto.stampaDettagli();
        moto.stampaDettagli();
    }
}
