package phpproje;
//import java.util.Random;

public abstract class Taktik {
	
	private int taktik;
	
	public Taktik(int taktik) {
		this.taktik = taktik;
		
	}
	public int getTaktik() {
		return taktik;
	}
	
	/*public void savas(Koloni[] koloniler) {
		int uzunluk = koloniler.length;
		
		for(int i = 0; i < uzunluk; i++) {
			Koloni koloni1 = koloniler[i];
			if(koloni1.getCanli() == 0) {
				continue;
			}
			for(int j = i + 1; j<uzunluk; j++) {
				Koloni koloni2 = koloniler[j];
				
				if(koloni2.getCanli() == 0) {
					continue;
				}
				if(koloni1.getTaktik() > koloni2.getTaktik()) {
					int fark = ((koloni1.getTaktik() - koloni2.getTaktik())/1000);
					int fark2 = fark * koloni2.getYemekstok();
					int kazanilanyemek = fark2 + koloni1.getYemekstok();
					int kaybedilenyemek = koloni2.getYemekstok() - fark2;
					koloni1.setYemekstok(kazanilanyemek);
					koloni2.setYemekstok(kaybedilenyemek);
					koloni2.setPopulasyon(koloni2.getPopulasyon() * (1-fark));
					koloni1.setKazanma(koloni1.getKazanma()+1);
					koloni2.setKaybetme(koloni2.getKaybetme()+1);
					koloniler[i] = koloni1;
					koloniler[j] = koloni2;					
				}else if(koloni1.getTaktik() < koloni2.getTaktik()) {
					int fark = ((koloni2.getTaktik() - koloni1.getTaktik())/1000);
					int fark2 = fark * koloni1.getYemekstok();
					int kazanilanyemek = fark2 + koloni2.getYemekstok();
					int kaybedilenyemek = koloni1.getYemekstok() - fark2;
					koloni2.setYemekstok(kazanilanyemek);
					koloni1.setYemekstok(kaybedilenyemek);
					koloni1.setPopulasyon(koloni1.getPopulasyon()* (1-fark));
					koloni2.setKazanma(koloni2.getKazanma()+1);
					koloni1.setKaybetme(koloni1.getKaybetme()+1);
					koloniler[i] = koloni1;
					koloniler[j] = koloni2;					
				}else if(koloni1.getTaktik() == koloni2.getTaktik()) {
					if(koloni1.getPopulasyon()>koloni2.getPopulasyon()) {
						int fark = ((5/100) * koloni2.getYemekstok());
						int fark2 = fark * koloni2.getYemekstok();
						int kazanilanyemek = fark2 + koloni1.getYemekstok();
						int kaybedilenyemek = koloni2.getYemekstok() - fark2;
						koloni1.setYemekstok(kazanilanyemek);
						koloni2.setYemekstok(kaybedilenyemek);
						koloni2.setPopulasyon((koloni2.getPopulasyon()*95)/100);
						koloni1.setKazanma(koloni1.getKazanma()+1);
						koloni2.setKaybetme(koloni2.getKaybetme()+1);
						koloniler[i] = koloni1;
						koloniler[j] = koloni2;					
					}else if(koloni1.getPopulasyon()<koloni2.getPopulasyon()) {
						int fark = ((5/100) * koloni1.getYemekstok());
						int fark2 = fark * koloni1.getYemekstok();
						int kazanilanyemek = fark2 + koloni2.getYemekstok();
						int kaybedilenyemek = koloni1.getYemekstok() - fark2;
						koloni2.setYemekstok(kazanilanyemek);
						koloni1.setYemekstok(kaybedilenyemek);
						koloni1.setPopulasyon((koloni1.getPopulasyon()*95)/100);
						koloni2.setKazanma(koloni2.getKazanma()+1);
						koloni1.setKaybetme(koloni1.getKaybetme()+1);
						koloniler[i] = koloni1;
						koloniler[j] = koloni2;					
					}else if(koloni1.getPopulasyon() == koloni2.getPopulasyon()) {
						 Random random = new Random();
						 int secim = random.nextInt(2); // 0 veya 1
						 if(secim == 0) {
							 int fark = ((5/100) * koloni2.getYemekstok());
								int fark2 = fark * koloni2.getYemekstok();
								int kazanilanyemek = fark2 + koloni1.getYemekstok();
								int kaybedilenyemek = koloni2.getYemekstok() - fark2;
								koloni1.setYemekstok(kazanilanyemek);
								koloni2.setYemekstok(kaybedilenyemek);
								koloni2.setPopulasyon((koloni2.getPopulasyon()*95)/100);
								koloni1.setKazanma(koloni1.getKazanma()+1);
								koloni2.setKaybetme(koloni2.getKaybetme()+1);
								koloniler[i] = koloni1;
								koloniler[j] = koloni2;					
						 }else {
							 int fark = ((5/100) * koloni1.getYemekstok());
								int fark2 = fark * koloni1.getYemekstok();
								int kazanilanyemek = fark2 + koloni2.getYemekstok();
								int kaybedilenyemek = koloni1.getYemekstok() - fark2;
								koloni2.setYemekstok(kazanilanyemek);
								koloni1.setYemekstok(kaybedilenyemek);
								koloni1.setPopulasyon((koloni1.getPopulasyon()*95)/100);
								koloni2.setKazanma(koloni2.getKazanma()+1);
								koloni1.setKaybetme(koloni1.getKaybetme()+1);
								koloniler[i] = koloni1;
								koloniler[j] = koloni2;					
						 }
					}
				}
				
			}
		}
	}*/
	
	public abstract int taktik();
	
	
}
