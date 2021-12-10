package TestAPI.TestDebugging;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="i am Adu",temp,reverse="";
		temp=str;
		for(int i=str.length()-1;i>=0;i--) 
		{
			char a=str.charAt(i);
			reverse=reverse+a;
			
		}
		System.out.println("Reverse string " +reverse);
		if(str.equals(reverse)) {
			System.out.println("String is not reversed");
			
		}
		else {
			System.out.println("String is reversed");
		}
	}

}
