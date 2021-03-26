package abstraction;

public abstract class Bank {

     abstract int interest(); //declare

    public void rule(){ //define
        System.out.println("minimum balance 100Rs");
    }
}

class SBI extends Bank{

    @Override
    int interest() {
        return 10;
    }

    public static void main(String[] args) {
        SBI obj = new SBI();
        System.out.println(obj.interest());
    }
}

class HDFC extends  Bank{

    @Override
    int interest() {
        return 9;
    }

    public static void main(String[] args) {
        HDFC obj = new HDFC();
        System.out.println(obj.interest());
    }
}