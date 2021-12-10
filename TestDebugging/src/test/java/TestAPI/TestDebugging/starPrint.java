package TestAPI.TestDebugging;

public class starPrint {
	
	public static void main(String[] args) {
		int n=7;
		int i,j=0;
		for(i=0; i<n;i++) {
			for(j=i;j<n;j++) {
			System.out.print("*");
		}
			System.out.println("");
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
