import java.net.*;

public class Test18 {
    public static void main(String[] args) {
    int a;
    int k = 7;
	
	System.out.printf("%d%n", k);
	
	Test18_1 t11 =  new Test18_1();
	a = t11.add(k, 4);
	System.out.printf("%d%n", a);    }
}

class Test18_1 {
    public  int add(int x, int y) {
		//int t = add(x, y);
		int t = x + y;
		return t;
	}
}

	