package tryCatch;

public class MultipleTryCatch {
  // if both (try) have exception it will be handled exception by catch block & print the msg.
	public static void main(String[] args) {
		
		try {
			
			int a=10, b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException a)

		{
			System.out.println("can't divide by zero");
		}
		try {
			
			int a[]= {10,20,30,40,50};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Beyond the array limit");
		}
	}

}
