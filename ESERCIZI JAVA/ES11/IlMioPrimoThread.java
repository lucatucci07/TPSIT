class MioThread extends Thread {
    public MioThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Eredità: " + getName());
    }
}

class MioRunnable implements Runnable {
    private final String name;

    public MioRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Runnable: " + name);
    }
}

public class IlMioPrimoThread {
    public static void main(String[] args) {
        MioThread thread1 = new MioThread("Thread-eredità");
        thread1.start();

        Thread thread2 = new Thread(new MioRunnable("Thread-Runnable"));
        thread2.start();

        Thread thread3 = new Thread(() ->
            System.out.println("Lambda")
        );
        thread3.start();
    }
}
