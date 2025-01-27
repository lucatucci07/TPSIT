import java.util.Scanner;

class Studente {
    private String nome = "Sconosciuto", cognome = "Sconosciuto";
    private double mediaVoti = 0.0;
    private int numeroVoti = 0;

    public void setNome(String nome) { this.nome = nome.isEmpty() ? "Sconosciuto" : nome; }
    public void setCognome(String cognome) { this.cognome = cognome.isEmpty() ? "Sconosciuto" : cognome; }
    public void setMediaVoti(double voto) {
        if (voto >= 0 && voto <= 10) {
            mediaVoti = ((mediaVoti * numeroVoti) + voto) / (++numeroVoti);
        }
    }
    public void stampaDettagli() { System.out.println(nome + " " + cognome + ", Media: " + mediaVoti); }
}

public class esc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studente s = new Studente();

        System.out.print("Nome: "); s.setNome(sc.nextLine());
        System.out.print("Cognome: "); s.setCognome(sc.nextLine());
        System.out.print("inserisci un voto (inserire un voto negativo per terminare e calcolare la media dei voti): ");
        double voto;
        while ((voto = sc.nextDouble()) >= 0) {
            System.out.print("inserisci un voto (inserire un voto negativo per terminare e calcolare la media dei voti): ");
            s.setMediaVoti(voto);
        }

        s.stampaDettagli();
        sc.close();
    }
}
