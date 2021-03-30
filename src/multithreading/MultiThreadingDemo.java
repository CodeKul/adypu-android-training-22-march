package multithreading;

public class MultiThreadingDemo extends Thread{

    @Override
    public void run() {
        System.out.println("In run method");
    }

    public static void main(String[] args) {

        MultiThreadingDemo obj = new MultiThreadingDemo();
        obj.run();

    }
}
