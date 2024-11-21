public class es2 {
    public static void main(String[] args) {
        int[] numeri = {15, 22, 8, 31, 42, 10, 5, 18, 35};
        int somma = 0, minimo = numeri[0], massimo = numeri[0];
        
        for (int numero : numeri) {
            somma += numero;
            if (numero < minimo) minimo = numero;
            if (numero > massimo) massimo = numero;
        }
        
        System.out.println("Media: " + (double) somma / numeri.length);
        System.out.println("Minimo: " + minimo);
        System.out.println("Massimo: " + massimo);
    }
}
