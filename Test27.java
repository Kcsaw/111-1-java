class Untitled {
	public static void main(String[] args) {
		int[] arr = {7, 5, 4, 9, 8, 1, 2};
		int cw = 0;
		int sum = 0;
		double total = 0;
		
		for(int i=0; i<arr.length/2; i++){
			sum = (cw+1);
			total = arr[sum] + arr[cw];
			total = total/2;
			System.out.println("out ="+total);
			cw=cw+2;
		}
		if(arr.length % 2 == 1){
		System.out.println("out ="+ arr[(arr.length-1)]);
		}
	}
}