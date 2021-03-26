package polymorphism;


/**
 * method overloading  - > we can write a same method in class with different signature
 */
public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.add(2, 5);
        obj.add(1, 2, 3);

    }

    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, int j, int k) {
        System.out.println(i + j + k);
    }
}


class MethodOverriding extends MethodOverloading{

    public void add(int i,int j){
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
//        obj.add();
    }



}