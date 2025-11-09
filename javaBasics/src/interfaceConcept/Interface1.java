package interfaceConcept;

interface  Interface1  {
	
	static void how() {
		
		System.out.println(" Statc method 'how' in interface");
		
	}
	
	
	void show();   // public+abstract
	
    int a = 10;   // public+static+final
	
	class student implements Interface1{
		
		
		
		public void show() {
			
			 System.out.println(" Hello Superclass");
			
		}
		
    }

	public static void main(String[] args) {
		
		Interface1 t = new student();
		t.show();
		Interface1.how();
		
		
		
 
	}

}



