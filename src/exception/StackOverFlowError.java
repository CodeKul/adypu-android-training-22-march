package exception;

public class StackOverFlowError {

    private void recursive(int i){
        System.out.println(i);
        if(i==0){
            return;
        }else {
            recursive(i);
        }


    }

    public static void main(String[] args) {
        StackOverFlowError obj = new StackOverFlowError();
        obj.recursive(1);
    }
}
