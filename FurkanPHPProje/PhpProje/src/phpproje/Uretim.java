package phpproje;

public abstract class Uretim {

	private int yemekstok;
	
	public Uretim(int yemekstok) {
		this.yemekstok = yemekstok;
	}
	
	public int getYemekstok() {
		return yemekstok;
	}
	public void setYemekstok() {
		
	}
	
	
	public abstract int uret();
}
