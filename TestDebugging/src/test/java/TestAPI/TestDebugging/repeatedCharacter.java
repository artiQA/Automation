package TestAPI.TestDebugging;

public class repeatedCharacter {
	
	public static void main(String[] args) {
		
		String str="I am adum";
		int count=0;
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				 
				 if(c[i]==c[j] && c[i]!=' ') {
						count++;
						System.out.println(c[i]);

						break;
					}	
				 
			}
			
		}
		System.out.println("Repeated string" +count);
	}

}
