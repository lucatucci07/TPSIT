class Veicolo {
   
    private String marca = "Ford";
    private String modello = "Fiesta";
    
    public void StampaDettagli() {
        System.out.println("La marca è " + marca);
        System.out.println("Il modello è " + modello);
        
    }
}

public class es1 {
    public static void main(String[] args) {
        Veicolo Veicolo = new Veicolo();
        Veicolo.StampaDettagli();
    }
}

