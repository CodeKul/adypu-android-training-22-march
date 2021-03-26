package abstraction;


//normal interface
//functional interface
//marker interface
public interface BankInterface {

   public abstract int interest(); //declare
    default void rule(){   //define

    }
}


class SBIInterfaceDemo implements BankInterface{

    @Override
    public int interest() {
        return 19;
    }


    public static void main(String[] args) {

        int i =10;
    }
}