import java.net.*;
import java.util.*;

public class Test25 {
    public static void main(String[] args) {
        int [] arr = {7, 5, 4, 9, 8, 1, 2};
        int []flag = new int[arr.length];
        int flag_count =1;
        
        int max = 0;
        int min = 10;
        int sum = 0;
        float avg;
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
            sum += arr[i];
        }
        avg = (float)sum / arr.length;
        
        //===============================================
        int med = 0;
        for (int i=0; i<4; i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for (int j=0; j<arr.length;j++){
                if(arr[j] < flag_min && flag[j] == 0){
                    flag_min = arr[j];
                    flag_min_index=j;
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count++;
            med = arr[flag_min_index];
        }
            System.out.println("max : "+max);
            System.out.println("måin : "+min);
            System.out.println("avg : "+avg);
            System.out.println("mad : "+med);
    }
}
            
            
import java.net.*;
import java.util.*;

public class Test25 {
    public static void main(String[] args) {
        int [] arr = {7, 5, 4, 9, 8, 1, 2};
        int []flag = new int[arr.length];
        int flag_count =1;
        
        int max = 0;
        int min = 10;
        int sum = 0;
        float avg;
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
            sum += arr[i];
        }
        avg = (float)sum / arr.length;
        
        //===============================================
        int med = 0;
        for (int i=0; i<4; i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for (int j=0; j<arr.length;j++){
                if(arr[j] < flag_min && flag[j] == 0){
                    flag_min = arr[j];
                    flag_min_index=j;
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count++;
            med = arr[flag_min_index];
        }
            System.out.println("max : "+max);
            System.out.println("måin : "+min);
            System.out.println("avg : "+avg);
            System.out.println("mad : "+med);
    }
}
            
            