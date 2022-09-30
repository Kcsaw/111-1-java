import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int num1;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 = input.nextInt();
        
        if (num1 >= 60)
            if (num1 >= 70)
                System.out.println("good!!");
            else 
                System.out.println("bad!!!!!!!!!!!");
        //是屬於70那行
        
    }
}