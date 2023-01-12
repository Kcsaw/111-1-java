import java.net.*;
import java.util.*;

public class Test24 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 8, 1, 2};
        int temp = 0;
        int len = arr.length; 
            for( int i = 0; i < len / 2; i++) {
                    temp = arr[len - 1 - i];
                    arr[len - 1 - i] = arr[i];
                    arr[i] = temp;
            }
            for (int i = 0;i<arr.length; i++) {
                System.out.println(arr[i]);
            }
    }
}

