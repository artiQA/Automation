package TestAPI.TestDebugging;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n=99;
		int i, flag=0, j=0;
		j=n/2;
		if(n==0||n==1) {
			System.out.println("Given number is prime " +n);
		}
		else {
			for(i=2;i<=j;i++) {
				System.out.println("Reminder " +n%i);

				if(n%i==0) {
					System.out.println("Given number is not prime " +n);

					flag=1;
					break;
					
				}

			}
			
			if(flag==0) {
				System.out.println("Given number is prime " +n);
			}
			
			
		}
		
		
	}

}
