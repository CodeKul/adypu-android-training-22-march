package control_statments;

public class IfElseDemo {

    public static void main(String[] args) {

        //simple if statement
        int age=18;
        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("you can not vote");
        }


        //ladder if or multiple if
        int a =1012,b=205,c=30;

        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c i greater");
        }


        //Nested if
        int j =18;
        String nationality = "Pak";

        if(j>=18){
            if(nationality.equals("Indian")){
                System.out.println("You can vote");
            }else {
                System.out.println("Not Indian");
            }
        }else {
            System.out.println("You can not vote");
        }


        //ternary operator
        String s =(age>=18)?"you can vote":"you can not vote";
        System.out.println(s);


        int k = 82;
        if(k%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
        }
    }
}
