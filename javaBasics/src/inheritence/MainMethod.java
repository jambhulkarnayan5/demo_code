package inheritence;

public class MainMethod {

public static void main(String[] args) {
		
		ChildStaticMethod c	= new ChildStaticMethod();
		ParentStaticMethod c1	= new ChildStaticMethod();
		ParentStaticMethod p	= new ParentStaticMethod();
		
		c.show(1);
		c1.show(1);
		p.show(1);
		c.f2();
		c1.f2();
		p.f2();

	}

}
