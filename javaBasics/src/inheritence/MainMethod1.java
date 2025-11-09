package inheritence;

public class MainMethod1 {
	
	public static void main(String[] args) {
		Child ch = new Child();	
		Parent p= new Parent();	
		 Parent      c2=    new   Child();
		// Child     c3=    (Child) new   Parent();
		
		ch.display();
		p.display();
		c2.display();
		
		ch.print();
		p.print();
		c2.print();
		
		ch.show();
		p.show();
		c2.show();
		

	}

}
