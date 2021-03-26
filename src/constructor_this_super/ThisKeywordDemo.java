package constructor_this_super;

public class ThisKeywordDemo {


    //Instance variable // globle variable
    int id;
    String name;
    String address;

    public ThisKeywordDemo(int empId, String empName, String empAddress) { //local variable
//        this.id = id;
//        this.name = name;
//        this.address = address;

        id = empId;
        name = empName;
        address = empAddress;
    }

    public void printData(){

        this.show();
    }

    public ThisKeywordDemo(){
        System.out.println("In constructor");
    }

    public ThisKeywordDemo(int i){
        this();
    }
    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo(1, "Sagar", "Pune");
        ThisKeywordDemo obj1 = new ThisKeywordDemo(1);
        obj.printData();
    }

    private void show() {
        System.out.println("id=>" + id + " name=>" + name + " address=>" + address);
    }

}
