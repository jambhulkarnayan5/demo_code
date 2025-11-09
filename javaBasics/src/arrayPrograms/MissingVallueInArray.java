package arrayPrograms;



public class MissingVallueInArray {

	public static void main(String[] args) {
		int n = 5;
		int a[] = { 1, 2, 4, 5 };
		int sumN = (n * (n + 1)) / 2;
		int sum = 0;
	//	for (int i = 0; i < a.length; i++)
		for(int s:a)   //--- you can use this & put s instead of a[i]

		{
			//sum = sum + a[i];
			sum = sum+s;
		}

		int missVal = sumN - sum;

		System.out.println(missVal);

	}

	}

