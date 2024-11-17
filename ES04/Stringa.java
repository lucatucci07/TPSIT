import java.util.Scanner;

public class Stringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String s = sc.nextLine();
        
        System.out.println("Lunghezza: " + s.length());
        System.out.println("Carattere posto al centro: " + s.charAt(s.length() / 2));
        System.out.println("Iniziale maiuscola: " + s.substring(0, 1).toUpperCase() + s.substring(1));
        System.out.println("Occorrenze di 'a': " + s.chars().filter(c -> c == 'a').count());
        System.out.println("Sottostringa (primi 4 caratteri): " + (s.length() >= 4 ? s.substring(0, 4) : s));
        System.out.println("Carattere maiuscolo: " + s.toUpperCase());
        System.out.println("Carattere minuscolo: " + s.toLowerCase());
        
        sc.close();
    }
}
