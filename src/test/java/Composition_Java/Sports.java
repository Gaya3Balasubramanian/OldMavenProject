package Composition_Java;

public class Sports {
	
	

	private KhoKho khokho;
	private Athletics athletics;
	
	public Sports(KhoKho khokho, Athletics athletics) {

		this.khokho = khokho;
		this.athletics = athletics;
	}
	
	public KhoKho getKhokho() {
		return khokho;
	}

	public Athletics getAthletics() {
		return athletics;
	}

}
