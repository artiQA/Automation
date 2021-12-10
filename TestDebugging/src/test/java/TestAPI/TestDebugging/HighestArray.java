package TestAPI.TestDebugging;

public class HighestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;

		int arr[]= {10,20,45,35,90};
		int max=arr[0];

		for(i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			System.out.println("Max is" +max);
			
		}
		}
		System.out.println("High arr" +max);
	}

}
