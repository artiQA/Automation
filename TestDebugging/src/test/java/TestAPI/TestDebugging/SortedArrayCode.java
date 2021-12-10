package TestAPI.TestDebugging;

public class SortedArrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,22,8,7,9,88};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("i " +arr[i]);
				System.out.println("j " +arr[j]);
				System.out.println("temp " +temp);

				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		//System.out.println("Ascending order");
		for(int i=0;i<arr.length;i++)
			System.out.println(+arr[i]);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Descending order");
		for(int i=0;i<arr.length;i++) {
		System.out.println(+arr[i]);
		}
		}

}
