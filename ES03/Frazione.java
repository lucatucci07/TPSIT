public class Frazione {
    private int numeratore;
    private int denominatore;

 
    public Frazione(int numeratore, int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    // Metodo per ottenere il denominatore
    public int getDenominatore() {
        return denominatore;
    }

    // Metodo per ottenere la rappresentazione testuale della frazione @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    // Metodo per sottrarre due frazioni
    public Frazione sottrai(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                - altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    // Metodo per moltiplicare due frazioni
    public Frazione moltiplica(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.numeratore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    // Metodo per dividere due frazioni
    public Frazione dividi(Frazione altraFrazione) {
        if (altraFrazione.numeratore == 0) {
            throw new IllegalArgumentException("Impossibile dividere per una frazione con numeratore zero.");
        }
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.numeratore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
}

