package basics;

public class JavaBlocks {
	
	

	  //a static block
	  static {
	    System.out.println("This is a static block");
	  }
	  
	  //constructor
	  JavaBlocks(){
	    System.out.println("This is the constructor of JavaBlocks");
	  }
	  
	  //non static block 
	  {
	    System.out.println("This is a non static block");
	  }
	    
	  public static void main(String[] args) {
	    System.out.println("This is the main method 1");
	    JavaBlocks obj1=new JavaBlocks(); //creation of object of the class to instantiate the constructor 
	   // JavaBlocks obj2=new JavaBlocks();
	    
	  }
	}


