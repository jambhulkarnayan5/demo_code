package collection;


	
	import java.io.*;
	import java.util.ArrayList;

	public class test {
		public static void main(String[] args) {
			ArrayList<Integer> numbers = new ArrayList<>();
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(2,4);
			
			for(int s:numbers) {
			System.out.print(s+" ");
			}
		}
	}



