package interfaceConcept;

import java.util.Scanner;

public class Developer implements Client {
	
	String name; double sal;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name: ");
		name=sc.nextLine();
		
		System.out.println("Enter salary: ");
		sal=sc.nextDouble();
	}
	
	public void output()
	{
		System.out.println(name+ " "+sal);
		
	}
	
	public static void main(String[] args)
	{
		Client c= new Developer();
         c.input();
         c.output();
	}
		
	}




