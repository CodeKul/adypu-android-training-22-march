package multithreading;


@FunctionalInterface
public interface LambdaInterface {
    String concate(String a,String b);

}

class LambadaDemo{

    public static void main(String[] args) {

        LambdaInterface s = (str1,str2)-> str1+ str2;
        System.out.println(s.concate("Pune","Mumbai"));


    }
}