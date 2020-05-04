package Composition_Java;

public class KhoKho {
	
	private String MalePlayer;
	private String femalePlayer;
	
	

	public KhoKho(String MalePlayer,String femalePlayer) {
		this.MalePlayer=MalePlayer;
		this.femalePlayer=femalePlayer;

		
		
	}
	
	
	public String getMalePlayer() {
		return MalePlayer;
		
	}

	public String getFemalePlayer() {
		return femalePlayer;
	}
	
	public void previouschampions(int champions) {
		System.out.println(champions);
	}

}
