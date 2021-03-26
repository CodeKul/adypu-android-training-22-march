package exception;

public class ArithmaticEx {

    public static void main(String[] args) {

        try {
            int i =10;
            int j = i/0;
            System.out.println(j);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("hii");
        String s = null;
        System.out.println(s.length());
    }
}
