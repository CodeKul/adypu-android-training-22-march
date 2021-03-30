package final_static;

public final class FinalKeywordDemo { //final class

    final int i = 10;//final variable

    final public void show() { //final method
//        i = 18;
        System.out.println("i=>" + i);
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo();
        obj.show();
    }
}
//
//class FinalOverRiding extends FinalKeywordDemo{
//
//    public void show(){
//
//    }
//}