import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
     int run = 5;
        for (int i = 1; i < run; i++) {

            int s1 = 2*i-1;
            int s2 = 0;
            
            while(s2!=(run-i-1)){
                System.out.print(" ");
                s2++;
            }
            while(s1!=0){
                System.out.print("*");
                s1--;
            }
            
            System.out.print("\n");
        }
        for (int i = run-2; i >0; i--) {
            
            int s1 = 2*i-1;
            int s2 = 0;
            
            while(s2!=(run-i-1)){
                System.out.print(" ");
                s2++;
            }
            while(s1!=0){
                System.out.print("*");
                s1--;
            }
            
            System.out.print("\n");
        }
    }
}