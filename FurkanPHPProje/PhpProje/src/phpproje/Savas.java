package phpproje;

import java.util.Random;

	public class Savas {
		Koloni koloni1;
		Koloni koloni2;
		public Savas(Koloni koloni1,Koloni koloni2) {
			this.koloni1 = koloni1;
			this.koloni2 = koloni2;
		}
		
	
	
		public void savas() {
			if(koloni1.getTaktik()>koloni2.getTaktik()) {
				float fark = (float) (koloni1.getTaktik() - koloni2.getTaktik())/1000;
				int fark2 = (int) (fark * koloni2.getYemekstok());
				int kazanilanyemek = fark2 + koloni1.getYemekstok();
				int kaybedilenyemek = koloni2.getYemekstok() - fark2;
				int pop = koloni2.getPopulasyon();
				int on = (int) (pop -(pop*fark));
				//int populasyonkayip =(koloni2.getPopulasyon() * fark);
				koloni1.setYemekstok(kazanilanyemek);
				koloni2.setYemekstok(kaybedilenyemek);
				koloni2.setPopulasyon(on);
				//koloni2.populasyonAzalt(fark);
				koloni1.setKazanma(1);
				koloni2.setKaybetme(1);			
			}else if(koloni1.getTaktik()<koloni2.getTaktik()) {
				float fark = (float)(koloni2.getTaktik() - koloni1.getTaktik())/1000;
				int fark2 = (int) (fark * koloni1.getYemekstok());
				int kazanilanyemek = fark2 + koloni2.getYemekstok();
				int kaybedilenyemek = koloni1.getYemekstok() - fark2;
				int pop = koloni1.getPopulasyon();
				int on = (int) (pop -(pop*fark));
				koloni2.setYemekstok(kazanilanyemek);
				koloni1.setYemekstok(kaybedilenyemek);
				//koloni2.populasyonAzalt(fark);
				//koloni1.populasyonAzalt(fark);
				koloni1.setPopulasyon(on );
				koloni2.setKazanma(1);
				koloni1.setKaybetme(1);	
			}else if(koloni1.getTaktik()==koloni2.getTaktik()) {
				if(koloni1.getPopulasyon()>koloni2.getPopulasyon()) {
					float fark = (float) (5/100);
					int fark2 = (int) (fark * koloni2.getYemekstok());
					int kazanilanyemek = fark2 + koloni1.getYemekstok();
					int kaybedilenyemek = koloni2.getYemekstok() - fark2;
					int pop = koloni2.getPopulasyon();
					int on = (int) (pop -(pop*fark));
					koloni1.setYemekstok(kazanilanyemek);
					koloni2.setYemekstok(kaybedilenyemek);
					//koloni1.populasyonAzalt(fark);
					koloni2.setPopulasyon(on);
					koloni1.setKazanma(1);
					koloni2.setKaybetme(1);
				}else if(koloni1.getPopulasyon()<koloni2.getPopulasyon()) {
					float fark = (float) (5/100);
					int fark2 = (int) (fark * koloni1.getYemekstok());
					int kazanilanyemek = fark2 + koloni2.getYemekstok();
					int kaybedilenyemek = koloni1.getYemekstok() - fark2;
					int pop = koloni1.getPopulasyon();
					int on = (int) (pop -(pop*fark));
					koloni2.setYemekstok(kazanilanyemek);
					koloni1.setYemekstok(kaybedilenyemek);
					koloni1.setPopulasyon(on);
					koloni2.setKazanma(1);
					koloni1.setKaybetme(1);
				}else if(koloni1.getPopulasyon()==koloni2.getPopulasyon()) {
					 Random random = new Random();
					 int secim = random.nextInt(2); // 0 veya 1
					 if(secim == 0) {
						 float fark = (float) (5/100);
						 int fark2 = (int) (fark * koloni2.getYemekstok());
						 int kazanilanyemek = fark2 + koloni1.getYemekstok();
						 int kaybedilenyemek = koloni2.getYemekstok() - fark2;
						 int pop = koloni2.getPopulasyon();
						 int on = (int) (pop -(pop*fark));
						 koloni1.setYemekstok(kazanilanyemek);
						 koloni2.setYemekstok(kaybedilenyemek);
						 koloni2.setPopulasyon(on);
						 koloni1.setKazanma(1);
						 koloni2.setKaybetme(1);
					 }else {
						 float fark = (float) (5/100);
						 int fark2 = (int) (fark * koloni1.getYemekstok());
						 int kazanilanyemek = fark2 + koloni2.getYemekstok();
						 int kaybedilenyemek = koloni1.getYemekstok() - fark2;
						 int pop = koloni1.getPopulasyon();
						 int on = (int) (pop -(pop*fark));
						 koloni2.setYemekstok(kazanilanyemek);
						 koloni1.setYemekstok(kaybedilenyemek);
						 koloni1.setPopulasyon(on);
						 koloni2.setKazanma(1);
						 koloni1.setKaybetme(1);
					 }
				}
			}
			
		}
		public Koloni getKoloni1() {
			return koloni1;
		}
		public Koloni getKoloni2() {
			return koloni2;
		}
		



		
}
