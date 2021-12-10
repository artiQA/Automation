package TestAPI.TestDebugging;

public class ReverseInteger {
	
	public static void main(String args[]) {
		
		int i =187000, reverse=0;
		
		while(i!=0) {
			reverse = reverse*10;
			System.out.println("Reverse" +reverse);
			reverse=reverse+i%10;
			System.out.println("2nd Reverse " +reverse);
			i=i/10;
			System.out.println("i is" +i );
			
		}
		
		System.out.println("Final reverse is " +reverse);
		
		
	}

}
