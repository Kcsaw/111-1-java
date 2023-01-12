import java.net.*;
import java.util.*;
//10 4 5
//The position is 7
//searchCount 1

public class Test28 {
	public static void main(String[] args) {
		int [] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int target = 3;
		int left = 0;
		int right = arr.length - 1;
		int med;
		int targetIndex = 0;
		int searchCount = 0;
		
//========================================================================
		
		for(int i=0; i<3; i++){
			med = (right - left) / 2 + left;
			if(arr[med] == target){
				targetIndex = med;
				break;
			}
			searchCount++;
			
			if(target > arr[med])
				right = med;
			else 
				left = med-1;
			System.out.printf("%d %d %d\n", right, left, med);
			}
			
		System.out.println("The position is " +  targetIndex);
		System.out.println("searchCount " + searchCount);
		}
	}

