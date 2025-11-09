package basics;

public class CountDigitInNumbers {

	public static void main(String[] args) {
		
		
//		int n = 675467;
//		int result= (int) (Math.log10(n)+1);
//		
//		System.out.println(result);
//
//	}
//
//}
		
		
		int num = 12345;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.print("Number of digits:" +count);
	}
}
