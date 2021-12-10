package TestAPI.TestDebugging;

public class test {
	
	public static void main(String[] args) {
		
		String one ="firedo";
		String two="foried";
		int count=one.length();
		int flag = 0;
		
		if(one.length()==two.length()) {
			System.out.println(count);
		for (int i=0;i<one.length();i++) {
			char a=one.charAt(i);
			
			for (int j=0;j<two.length();j++) {
			char b=two.charAt(j);
			
				if(a==b) {
					
					flag++;
					
				}
			
				
			}
			
			
			}
		if(flag==count) {
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not anagram");
		}
			
			
			
			
		}
		else {
			System.out.println("Not Anagram");
		}
		
		
	}

}
