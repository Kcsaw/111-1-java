public class Test19	 {       
    public static void main(String[] args) {
        int a = 6;       //左極限
        int b = 6;       //右極限

        for (int row = 1; row < 10 ; row++) {

            for (int col = 1; col <= 11; col++) {

                if (col >= a && col <= b) {       //字元輸出選擇
                    System.out.print(" ");
                }
                
                else {
                    System.out.print("*");
                }

            }
            
            if(row < 5) {                         
                a -= 1;
                b += 1;
            }

            else {
                a += 1;
                b -= 1;               
            }

            System.out.print("\n");
        }
    }
}