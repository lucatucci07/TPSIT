public class Saluta extends Thread {
    public Saluta(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread che saluta. ");
    }

    public static void main(String[] args) {
        new Saluta("SalutoThread").start();
        new Thread(() -> System.out.println("Thread tramite runnable"), "RunnableThread").start();
        new Thread(() -> System.out.println("lamda expression"), "LambdaThread").start();
    }
}
        