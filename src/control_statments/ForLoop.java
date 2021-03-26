package control_statments;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            System.out.println("Hii");
        }

        int[] arr = new int[5];
        arr[0]= 1;
        arr[1]= 2;
        arr[2]= 3;
        arr[3]= 4;
        arr[4]= 5;

        int[] arr1 = {1,2,3,4,5};

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println();
       //traditional for loop
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        System.out.println();
        //enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(s->{
            System.out.println(s);
        });
    }
}
