package PrivateMehodCalling;


import java.lang.reflect.Method;



public class Test1 {
	
  private	int a = 5, b=4, c;
  private void cal() {
	  
	  c=a*b;
	  }
  
  private void put() {
	  System.out.println("Value of a = "+a);
	  System.out.println("Value of b = "+b);
	  System.out.println("Product = "+c);
	  
	  
  }
  
  // Create friendly function to call private members
  void disp() {
	  
	  cal();
	  put();
	
	  
  }
  
  
  

 
	
	
	
	
   }


