class veicolo{
    private String marca = "ford";
    private String modello = "panda";

    public void StampaDettagli(){
        System.out.println("marca: " +marca);
        System.out.println("modello: "  +modello);
    }

}

public class macchina{
    public static void main(String[] args) {
        veicolo veicolo = new veicolo();
        veicolo.StampaDettagli();
    }
}