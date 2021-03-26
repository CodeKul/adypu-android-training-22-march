package test;

public class A {


    //primitive datatype
    int i = 0;
    long l;
    byte b;
    boolean b1;
    short s;
    float f;
    char c;
    double aDoub;


    //non primitive
    String string = "sagar";
    Integer integer = 10;
    Boolean aBoolean;
    Byte aByte;
    Short aShort;
    Float aFloat;
    Double aDouble;
    Character character;


    private static void show() {
        System.out.println("In show");
    }

    static public void main(String[] args) {

        A obj = new A();
//
//     obj.show();


        obj.string.charAt(3);
        obj.integer.hashCode();
        show();
    }
}
