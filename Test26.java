import java.net.*;
import java.util.*;

public class Test26 {
    public static void main(String[] args) {
        int [] arr = {7, 5, 4, 9, 8, 1, 2};
        int []flag = new int[arr.length];
        int flag_count =1;
        int med = 0;
        int index = 0;
        int min = 10;
        int sum = 0;
        int op = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        op = input.nextInt();
        //===============================================
        
        for (int i=0; i < arr.length; i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for (int j=0; j<arr.length;j++){
                if(arr[j] < flag_min && flag[j] == 0){
                    flag_min = arr[j];
                    flag_min_index=j;
                    index=j;
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count++;
            med = arr[flag_min_index];
            
            if(op == flag[index]){
                System.out.println("mad : "+arr[index]);
                break;
            }
        }
    }
}
            
            