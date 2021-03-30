package multithreading;

public class HiiHello {

    public static void main(String[] args) {
        Hii hii = new Hii(); //  new
        Hello hello = new Hello();

        hii.start();//runnable
        hello.start();


    }
}

class Hii extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){ //running
            System.out.println("Hii");

            try {
                Thread.sleep(1000);//blocked
            } catch (InterruptedException e) {
                System.out.println("Thread sleep exception->>"+e);
            }

        }
    }
}

class Hello extends Thread{


    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Hello");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}