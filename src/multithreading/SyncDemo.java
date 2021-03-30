package multithreading;

public class SyncDemo {

    int num;

    public synchronized void print(){
        num++;
    }


    public static void main(String[] args) {

        SyncDemo obj = new SyncDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.print();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.print();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj.num);


    }
}
