package phpproje;

public class Koloni {
	
	private String simge;
	private int populasyon;
	private int  yemekstok;
	private int kazanma;
	private int kaybetme;
	private int canli;
	private int taktik;
	
	public Koloni(String simge,int populasyon, int kazanma, int kaybetme,int canli) {
		this.simge = simge;
		this.populasyon = populasyon;
		this.yemekstok = populasyon * populasyon;
		this.kazanma = kazanma;
		this.kaybetme = kaybetme;
		this.canli = canli;
		this.taktik = 0;
		
	}
	
	public void setCanli(int canli) {
		this.canli = canli;
	}
	public void setSimge(String simge) {
		this.simge = simge;
	}
	public void setTaktik(int taktik) {
		this.taktik = taktik;
	}
	public void setKazanma(int value) {
		this.kazanma += value;
	}
	public void setKaybetme(int value) {
		this.kaybetme += value;
	}
	public void setYemekstok(int yeniYemekstok) {
		this.yemekstok = yeniYemekstok;
	}
	public void setPopulasyon(int kayip) {
		this.populasyon = kayip;
	}
	public String getSimge() {
		return simge;
	}
	public int getPopulasyon() {
		return populasyon;
	}
	public int getYemekstok() {
		return yemekstok;
	}
	public int getTaktik() {
		return taktik;
	}
	public int getKazanma() {
		return kazanma;
	}
	public int getKaybetme() {
		return kaybetme;
	}
	public int getCanli() {
		return canli;
	}
	public void populasyonAzalt(int fark) {
		//int azaltanPopulasyon = (int) (getPopulasyon()-(getPopulasyon()*fark));
		//setPopulasyon(azaltanPopulasyon);
		int populasyonazalt = (int) (populasyon * fark/1000);
		populasyon -= populasyonazalt;
	    
	}
	public void populasyonArttir() {
		int artisMiktari = (int) (populasyon * 0.2); 
	    populasyon += artisMiktari; 
	    
	}
	public void yemekStokazalt() {
		int azalmaMiktari = (int) (populasyon * 2);
		yemekstok -= azalmaMiktari;
	}
	public void CanliMi() {
		if(this.yemekstok < this.populasyon * 2 || this.populasyon <= 0) {
			this.setPopulasyon(0);
			this.setYemekstok(0);
			this.setCanli(0);		
		}
	}
	
	

	
	
}
