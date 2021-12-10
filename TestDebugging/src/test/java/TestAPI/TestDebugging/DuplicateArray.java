package TestAPI.TestDebugging;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,8,7,8,9,9};
		
		for(int i= 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate int " +arr[i]);
				}
			}
		}

	}

}
