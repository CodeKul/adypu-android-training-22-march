package static_keyword;

public class EmployeeDemo {

    static String companyName;
    int id;
    String name;

    static {
       companyName = "abc";
    }

    public static void show(){
        System.out.println("In show static");
    }

    public static void main(String[] args) {
        EmployeeDemo obj1 = new EmployeeDemo();
        obj1.id = 1;
        obj1.name = "Sachin";


        EmployeeDemo obj2 = new EmployeeDemo();
        obj2.id = 2;
        obj2.name = "Sagar";


        EmployeeDemo obj3 = new EmployeeDemo();
        obj3.id = 3;
        obj3.name = "Sahil";


        System.out.println("Id=>" + obj1.id + " name=>" + obj1.name + " comapnyName=>" + companyName);
        System.out.println("Id=>" + obj2.id + " name=>" + obj2.name + " comapnyName=>" + companyName);
        System.out.println("Id=>" + obj3.id + " name=>" + obj3.name + " comapnyName=>" + companyName);

        EmployeeDemo.show();
    }

}


class StaticDemo{

    public static void main(String[] args) {
        EmployeeDemo.show();
    }
}