package TestAPI.TestDebugging;

import java.util.Arrays;
import java.util.Collections;

public class sortedArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,13,8,13,9,7,99};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Integer arr1[]= {23,12,12,19,65,36,12};
		
		Arrays.sort(arr1,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr1));
			
		}

	}


