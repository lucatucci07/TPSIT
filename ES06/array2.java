class Auto {
    String modello;
    int posti;

    Auto(String modello, int posti) {
        this.modello = modello;
        this.posti = posti;
    }
}

public class array2 {
    public static void main(String[] args) {
        Auto[] automobili = {
            new Auto("Audi A3", 5),
            new Auto("Ford Explorer", 7),
            new Auto("Honda Odyssey", 7),
            new Auto("BMW Serie 3", 3),
            new Auto("Mercedes-Benz V-Class", 7)
        };

        for (Auto auto : automobili) {
            if (auto.posti == 7) 
                System.out.println("MODELLI AUTO CON 7 POSTI: " + auto.modello);
        }
    }
}
