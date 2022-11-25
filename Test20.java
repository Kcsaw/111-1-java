import java.net.*;
import java.util.*;

public class Test20 {
    public static void main(String[] args) {
    int K ;

	Scanner input = new Scanner(System.in);
	System.out.println("輸入公里數:");
	K = input.nextInt();
	
	if (K > 7) {
		System.out.println((85+ (K - 7) * 5)+"NT");
	}
	else {
		System.out.println("85NT");
	
	}
	}
}
	