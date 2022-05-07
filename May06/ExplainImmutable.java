package May06;

public class ExplainImmutable 
{
	/*
	 In this program we are using "final" keyword which makes the datatype immutable ,
	 In this program i have made int z immutable thats why we cant change the value of int z.
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int w=20;
		int x=80;
		int y=x/w;
		final int z=w*x;
		
		System.out.println("before changing " +"y="+y);
		System.out.println("before changing " +"z="+z);
		
		y=w+x;
		//d=a-b;        here we tried to make changes but we failed ,becoz "z" is immutable
		System.out.println("after changing " +"y="+y);
		//System.out.println("after changing " +z);
	}

}
