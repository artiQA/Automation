package TestAPI.TestDebugging;

import java.util.Arrays;

public class TestDebug {

	public static void main(String args[]) {
		
		int a =10;
		int b=20;
		int c=30;
		int sum=0;
		int sub=0;
		
		sum = a+b+c;
		System.out.println("Sum is "+sum);
		sub=sum-a;
		System.out.println("Substraction is " +sub);
		sum=sum*sub;
		System.out.println("Multiplication is " +sum);
		
		int arr[] = {0,1,1,0,1,0,1,1};
		
	      for (int i = 0; i < arr.length; i++)   
	      {  
	      for (int j = i + 1; j < arr.length; j++)   
	      {  
	      int tmp = 0;  
	      if (arr[i] < arr[j])   
	      {  
	      tmp = arr[i];  
	      arr[i] = arr[j];  
	      arr[j] = tmp;  
	      }  
	      }  
	      //prints the sorted element of the array  
	      System.out.println(arr[i]);  
	}
}
}
