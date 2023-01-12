import java.net.*;
import java.util.*;
import java.util.Arrays;

public class Test22 {
		public static void main(String[] args) {
			int []arr = {2, 7, 3, 4, 9};
			Test22(arr);
		}
	
		public static void Test22(int [] arr) {
			for(int i = 1; i < arr.length; i++) {
				
				int insertVal = arr[i];
				int insertIndex = i-1; 
				
				while(insertIndex >= 0 && insertVal < arr[insertIndex]) { 
					arr[insertIndex + 1] = arr[insertIndex];
					insertIndex--;
				}
				
				arr[insertIndex + 1] = insertVal;
				
				System.out.println(Arrays.toString(arr));
			} 
		}
	}

