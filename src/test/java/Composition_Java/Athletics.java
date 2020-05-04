package Composition_Java;

public class Athletics {
	

	private String MaleAthlete;
	private String FemaleAthlete;
	private Ath1 ath1;
	
	public Athletics(String MaleAthlete,String FemaleAthlete ,Ath1 ath1) {
		this.MaleAthlete=MaleAthlete;
		this.FemaleAthlete=FemaleAthlete;
		this.ath1=ath1;
	
		
	}

	public String getMaleAthlete() {
		return MaleAthlete;
	}

	public String getFemaleAthlete() {
		return FemaleAthlete;
	}

	public Ath1 getAth1(int i) {
		return ath1;
	}
	
	

}
