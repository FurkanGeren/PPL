package phpproje;

public class Oyun {
	private Koloni[] koloniler;
	private int tur;
	private int kolonisayisi;
	public Oyun(Koloni[] koloniler,int tur,int kolonisayisi) {
		this.koloniler = koloniler;
		this.tur = tur;
		this.kolonisayisi =kolonisayisi;
	}
	public void kolonileriBastir() {
		System.out.println("");
		System.out.println("Tur:"+tur);
		System.out.println("Simge || Populasyon || YemekStok || Kazanma || Kaybetme");
		for(int i =0;i<kolonisayisi;i++) {
			
			//Koloni koloni = koloniler[i];
			//koloni = koloniler[i];
			
			
			int bak = koloniler[i].getCanli();
			
			if(bak == 0) {
				System.out.println("   "+koloniler[i].getSimge()+"        --             --         --         --");
			}else{
				System.out.println("   "+koloniler[i].getSimge()+"        "+koloniler[i].getPopulasyon()+"          "+koloniler[i].getYemekstok()+"        "+koloniler[i].getKazanma()+"           "+koloniler[i].getKaybetme());
			}
		}
		
	}
	public void setTur() {
		this.tur += 1;
	}
}
