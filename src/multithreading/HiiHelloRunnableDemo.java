package multithreading;

public class HiiHelloRunnableDemo {

    public  void show(){
        System.out.println("");
    }
    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
                for(int i=1;i<=5;i++){ //running
                    System.out.println("Hii");

                    try {
                        Thread.sleep(1000);//blocked
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep exception->>"+e);
                    }
                }
        });


        Thread t2 = new Thread(()-> {
                for(int i=1;i<=5;i++){ //running
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);//blocked
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep exception->>"+e);
                    }

                }
        });

        t1.start();
        t2.start();


//        //ProducerConsumer problem
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Bye");

    }
}
