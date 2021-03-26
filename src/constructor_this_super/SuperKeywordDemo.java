package constructor_this_super;

public class SuperKeywordDemo {

    public SuperKeywordDemo(){
        System.out.println("In constructor parent");
    }

    public SuperKeywordDemo(int i){
        System.out.println("In parameter parent const "+i);
    }

}

class Sample extends SuperKeywordDemo{

   public Sample(){
       super();
       System.out.println("In const child");
   }

   public Sample(int i){
       super(i);
       System.out.println("In child parameter const"+i);
   }

}

class Main{
    public static void main(String[] args) {
        Sample sample = new Sample(1);
    }
}