package singletoneClass2;
// yt ElucidateAcademy1.0
public class MhGoldMining {
	
	String city1 = "Mumbai";
	String city2 = "Pune";
	
	static MhGoldMining mhobject = new MhGoldMining();
	
	private MhGoldMining() {
		
	}
	
	public static MhGoldMining getonlymhpart() {
		return mhobject;
	}
}
