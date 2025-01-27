class Dipendente {
    protected String nome;
    protected double stipendioBase;

    public Dipendente(String nome, double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public void stampaStipendio() {
        System.out.println("Nome: " + nome + ", Stipendio Base: " + stipendioBase);
    }
}

class Manager extends Dipendente {
    private double bonus;

    public Manager(String nome, double stipendioBase, double bonus) {
        super(nome, stipendioBase);
        this.bonus = bonus;
    }

    @Override
    public void stampaStipendio() {
        System.out.println("Nome: " + nome + ", Stipendio Totale: " + (stipendioBase + bonus));
    }
}

public class es2 {
    public static void main(String[] args) {
        Dipendente d = new Dipendente("luca", 1500.0);
        Manager m = new Manager("Lucia", 2000.0, 3000.0);

        d.stampaStipendio();
        m.stampaStipendio();
    }
}
