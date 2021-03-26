package inheritance;

/**
 *
 * inheritance -> child class can aquire al the properties of parent class
 * types of inheritance -> 1 . Single level
 *                         2 . multilevel
 *                         3 . multiple (java doesnt support)
 *                         4 . hierarchical
 *                         5 . Hybrid
 *
 *                         advantage -> we can  reuse the code
 *
 */
public class Sample1 { //parent class , super class

    int i =10;

    public void show(){
        System.out.println("in show");
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        System.out.println(sample1.i);


    }
}

class Sample2 extends Sample1{ //child class ,


    public void show(){
        System.out.println("in show");
    }

    public static void main(String[] args) {
       Sample2 obj = new Sample2();
       obj.show();

    }
}

class Sample3 extends Sample2{


    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        sample3.show();
    }
}