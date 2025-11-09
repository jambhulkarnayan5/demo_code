package tryCatch;

public class NestedTry {

	public static void main(String[] args) {

		try 
		{
			
			int a[] = { 10,0,30, 40, 50 };
			
			try 
			{
				
				int b=a[3]/a[1];

			} 
			catch (ArithmeticException e) 
			{
				System.out.println(e);
			}
			int c= a[3]+a[1];
			System.out.println(c);
			
		}

		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		System.out.println("Last statement");

	}

}
