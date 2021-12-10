package TestAPI.TestDebugging;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1332,reverse=0,temp=0;
		
		temp=n;
		while(n!=0) {
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		if(reverse==temp) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
