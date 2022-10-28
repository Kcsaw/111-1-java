public class Test17_2 {
    public static void main(String[] args) {
		for (int i=1; i<=6 ; i++){
			for (int k=6; k>=1; k--){
				if (i<k)
					System.out.print("*");
				else
					System.out.print(i-k+1);
			}
		System.out.println("");
        }
	}       
}  