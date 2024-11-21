import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        int[] numeri = {15, 22, 37, 48, 59, 63, 71, 84, 92, 100};
        int posizioneScelta = 4;
        int valoreDaIndovinare = numeri[posizioneScelta];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho scelto un numero in una posizione dell'array");

        int tentativo;
        do {
            System.out.print("Inserisci un numero: ");
            tentativo = scanner.nextInt();

            if (tentativo < valoreDaIndovinare) {
                System.out.println("numero inserito trppo basso");
            } else if (tentativo > valoreDaIndovinare) {
                System.out.println("numero inserito troppo alto");
            }
        } while (tentativo != valoreDaIndovinare);

        System.out.println("Esatto, Il numero era: " + valoreDaIndovinare);
        scanner.close();
    }
}
