package collection_demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    int id;
    String name;
    String address;

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Sagar";
        employee.address = "Pune";

        Employee employee1 = new Employee();
        employee1.id = 2;
        employee1.name = "Sachin";
        employee1.address = "Nashik";

        Employee employee2 = new Employee();
        employee2.id = 3;
        employee2.name = "Ramesh";
        employee2.address = "Mumbai";

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);


        list.forEach(s -> {
            System.out.println("id=>" + s.id + " name=>" + s.name + " address=>" + s.address);
        });


    }
}
