import java.util.Scanner;

class Calcolatrice {
    public float somma(float n1, float n2) {
        return n1 + n2;
    }

    public float sottrazione(float n1, float n2) {
        return n1 - n2;
    }

    public float moltiplicazione(float n1, float n2) {
        return n1 * n2;
    }

    public float divisione(float n1, float n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("Errore: Divisione per zero non consentita.");
        }
        return n1 / n2;
    }
}

public class calcolatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcolatrice calcolatrice = new Calcolatrice();

        try {
            System.out.print("Inserisci il primo numero: ");
            float num1 = Float.parseFloat(scanner.nextLine());

            System.out.print("Inserisci il secondo numero: ");
            float num2 = Float.parseFloat(scanner.nextLine());

            System.out.println("Inserisci un numero che corrisponde ad un'operazione: ");
            System.out.println("1 - Somma (+)");
            System.out.println("2 - Sottrazione (-)");
            System.out.println("3 - Moltiplicazione (*)");
            System.out.println("4 - Divisione (/)");
            
            int scelta = Integer.parseInt(scanner.nextLine());

            float risultato = 0;

            switch (scelta) {
                case 1:
                    risultato = calcolatrice.somma(num1, num2);
                    break;
                case 2:
                    risultato = calcolatrice.sottrazione(num1, num2);
                    break;
                case 3:
                    risultato = calcolatrice.moltiplicazione(num1, num2);
                    break;
                case 4:
                    risultato = calcolatrice.divisione(num1, num2);
                    break;
                default:
                    System.out.println("Errore: Operazione non valida.");
                    return;
            }

            System.out.println("Risultato: " + risultato);

        } catch (NumberFormatException e) {
            System.out.println("Errore: Inserisci un valore numerico valido.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
