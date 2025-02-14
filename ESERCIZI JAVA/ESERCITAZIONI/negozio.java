class ProdottoElettronico {
    private String nome;
    private double prezzo;

    public ProdottoElettronico(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome + ", Prezzo: " + prezzo);
    }
}

class Smartphone extends ProdottoElettronico {
    private String marca;
    private int memoria;

    public Smartphone(String nome, double prezzo, String marca, int memoria) {
        super(nome, prezzo);
        this.marca = marca;
        this.memoria = memoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Nome: " + getNome() + ", Prezzo: " + getPrezzo() + ", Marca: " + marca + ", Memoria: " + memoria + "GB");
    }
}

class Televisore extends ProdottoElettronico {
    private String risoluzione;
    private int dimensioneSchermo;

    public Televisore(String nome, double prezzo, String risoluzione, int dimensioneSchermo) {
        super(nome, prezzo);
        this.risoluzione = risoluzione;
        this.dimensioneSchermo = dimensioneSchermo;
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setDimensioneSchermo(int dimensioneSchermo) {
        this.dimensioneSchermo = dimensioneSchermo;
    }

    public int getDimensioneSchermo() {
        return dimensioneSchermo;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Nome: " + getNome() + ", Prezzo: " + getPrezzo() + ", Risoluzione: " + risoluzione + ", Dimensione Schermo: " + dimensioneSchermo + " pollici");
    }
}

public class negozio {
    public static void main(String[] args) {
        ProdottoElettronico[] prodotti = {
            
            new Smartphone("Samsung Galaxy S23", 999.99, "Samsung", 128),
            new Televisore("LG OLED", 1799.99, "4K", 55)

        };

        for (ProdottoElettronico prodotto : prodotti) {
            prodotto.stampaDettagli();
        }
    }
}
