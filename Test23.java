import java.net.*;
import java.util.*;

public class Test23 {
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int c = 0;
        for(int x = 0; x < arr.length; x++){
            if(arr[x] == 2) {
                System.out.println(x);
                break;
            }
        c++;
    } 
    System.out.println(c);
}
}