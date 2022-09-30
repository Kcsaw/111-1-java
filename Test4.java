import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int num1;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 = input.nextInt();
        
        if (num1 >=90) {
            System.out.println("完美!!");
        }
        else if (num1 >=60){
            System.out.println("及格");
        }
        else {
            System.out.println("不及格!!!!!!!!!!!");
        }
        
    }
}