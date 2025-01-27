import java.util.Scanner;

class ContoBancario {
    private int saldo;

    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) { if (saldo >= 0) this.saldo = saldo; }

    public void deposita(int importo) { if (importo > 0) setSaldo(getSaldo() + importo); }

    public void preleva(int importo) {
        if (importo > 0 && importo <= getSaldo()) setSaldo(getSaldo() - importo);
    }
}

public class esb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoBancario conto = new ContoBancario();

        conto.setSaldo(1500);  
        System.out.print("saldo iniziale: 1500 \n");
        System.out.print("Inserisci l'importo da prelevare: ");
        conto.preleva(scanner.nextInt());
        System.out.println("Saldo finale: " + conto.getSaldo());
        scanner.close();
    }
}
