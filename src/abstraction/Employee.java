package abstraction;

public class Employee implements MyInterface {
//we are adding special behaviour to class
    public void  show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        if(employee instanceof MyInterface){
            employee.show();
        }
    }
}


interface MyInterface{

}
