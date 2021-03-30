package multithreading;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("In run method");
    }

    public static void main(String[] args) {
        RunnableDemo obj = new RunnableDemo();

        Thread t1 = new Thread(obj);
        t1.start();

    }
}
