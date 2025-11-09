package singletoneClass2;

public class JhGoldMinging {
	
	public static void main (String []args) {
		
		MhGoldMining jhgroup1 = MhGoldMining.mhobject;
		
		System.out.println(jhgroup1.city1);
		
		System.out.println(jhgroup1.city2);
		
		MhGoldMining jhgroup2 = MhGoldMining.mhobject;
		
        System.out.println(jhgroup2.city1);
		
		System.out.println(jhgroup2.city2);
		
		System.out.println(jhgroup1.hashCode());
		System.out.println(jhgroup2.hashCode());
		
	}

}
