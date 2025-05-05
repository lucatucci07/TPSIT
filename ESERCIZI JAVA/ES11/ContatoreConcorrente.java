class Contatore {
    private int valore = 0;
    public void incrementa() {
        valore++;
    }
    public int getValore() {
        return valore;
    }
}

class ThreadContatore implements Runnable {
    private Contatore c;
    public ThreadContatore(Contatore c) {
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.incrementa();
        }
    }
}

public class ContatoreConcorrente {
    public static void main(String[] args) throws InterruptedException {
        Contatore c = new Contatore();
        Thread t1 = new Thread(new ThreadContatore(c));
        Thread t2 = new Thread(new ThreadContatore(c));
        Thread t3 = new Thread(new ThreadContatore(c));
        Thread t4 = new Thread(new ThreadContatore(c));
        Thread t5 = new Thread(new ThreadContatore(c));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Contatore finale: " + c.getValore());
    }
}
