package constructor_this_super;



/**
 //Constructor - > it is special type of function and it execute when we create a object/Instance of class.
 type of constructor ->

 1. default constructor (No parameter)
 2. parameterized constructor

 Rule -> 1. constructor name and class should be same
         2. no return type
         3. we can not use static , final, synchronized keyword with constructor
 *
 *
 */


public class ConstructorDemo {

    public void show(){

    }

    public ConstructorDemo(){
        System.out.println("In constructor");
    }

    public ConstructorDemo(int i){
        System.out.println("In parameterized const"+i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(1);

    }
}
