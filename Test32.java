import java.net.*;
import java.util.*;

//lemmejt@LemmedeMacBook-Air 111-1-java-main % javac Test32.java
//lemmejt@LemmedeMacBook-Air 111-1-java-main % java Test32 1 2 3 4 5
//x 20
//x, y 40
//y 30.0
//args[] 1
//args[] 2
//args[] 3
//args[] 4
//args[] 5
//total15
public class Test32 {
    public static void main(String[] args) {
        int x = 10;
        double y =10.0;
        System.out.println("x " + setV(x));
        System.out.println("x, y " + setV(x, 3));
        System.out.println("y " + setV(y));
        
        int total = 0;
        for (String str : args) {
            total += Integer.parseInt(str);
            System.out.println("args[] " + str);
        }
        System.out.println("total" + total);
    }
    
    public static int setV(int x){
        return x = 20;
    }
    public static int setV(int x, int y){
        return x = 40;
    }
    public static double setV(double x){
        return x = 30.0;
    }
}
            
            