package TestAPI.TestDebugging;

public class PalindrmeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am Adu", temp="",reverse="";
		temp=str;
		for(int i=str.length()-1;i>=0;i--) {
			char a = str.charAt(i);
			System.out.println(a);
			reverse=reverse+a;
			System.out.println(reverse);
		}
		System.out.println("Final reverse " +reverse);
		if(temp.equals(reverse)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
