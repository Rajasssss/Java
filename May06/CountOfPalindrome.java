package May06;

public class CountOfPalindrome
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="anna and bob are state level players";
		a.trim();
		a=a+" ";
		String b="";
		String c="";
		int count=0;
		
		for(int i=0;i<a.length();i++) 
		{
			char x=a.charAt(i);
			if(x!=' ') 
			{
				b=b+x;
				c=x+c;	
			}
		
			else if (x==' ')
			{
				if(b.equalsIgnoreCase(c)) 
				{
					System.out.println(b+" "+c);
					count++;
				}
				else 
				{
					b="";
					c="";
				}
			}
		} 
		System.out.println("The count of Palindrome words are :"+count);
	}

}
