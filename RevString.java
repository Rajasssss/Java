package mypack1;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABCD";
		int b= a.length();
		String c="";
		
		for (int i=b-1 ; i>=0 ;i--) {
			c=c+a.charAt(i);
			
		}
		System.out.print(c);
	}

}
