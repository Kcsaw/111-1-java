import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i < row; i++) {

            int star = 2*i-1;
            int num = 0;
            
            while(num!=(row-i-1)){
                System.out.print(" ");
                num++;
            }
            
            while(star!=0){
                System.out.print("*");
                star--;
            }
            System.out.print("\n");
        }
}
}