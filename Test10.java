import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int row = 0;
       
        while (row < 5) {
            int star = 0;
            
            while (star <= row) {
                System.out.print("*");
                star = star + 1;
              }
            System.out.println("");
            row = row + 1;
           }
         
               
        int row2 = 0;
        while (row2 < 6) {
            int star2 = 5;
            while (star2 >= row2) {
                System.out.print("*");
                star2 = star2 - 1;
              }
            System.out.println("");
            row2 = row2 + 1;
           }
}       
}     
             
        
   