package stringConcept;

public class StringReverseDiffTypes {

	public static void main(String[] args) {
	
//			StringBuffer r = new StringBuffer ("ABCD");
//			System.out.println(r.reverse());
//			
//			StringBuilder ref = new StringBuilder ("JAVA");
//			System.out.println(ref.reverse());
//
//			}
//		
//	}
		
		
		String s = "Java learing";
		String rev = "";
		
		char a[]=s.toCharArray();
		int len = a.length;
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("Reverse string is:"+rev);
		
	}
}


