package phpproje;
import java.util.Scanner;
import java.util.Random;



public class Main {
	private static String rastgeleSembol() {
        String semboller = "!@#$%^&*()_+-={}[]|\\:;\"',.?/~`";
        Random random = new Random();
        int index = random.nextInt(semboller.length());
        char sembol = semboller.charAt(index);
        return String.valueOf(sembol);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int MAX_KOLONI_SAYISI = 100;
		int kolonisayisi = 0;
		int populasyon;
		int kazanma = 0;
		int kaybetme = 0;
		int canli = 1;
		int tur = 0;
		int gecicitaktik = 0;
		//int[] yemekstok = new int[MAX_KOLONI_SAYISI];
		Koloni[] koloniler = new Koloni[MAX_KOLONI_SAYISI];
		System.out.print("Sayilari giriniz(Sayilardan sonra bosluk birakip herhangi bir harfe basiniz):");
		while(scanner.hasNextInt() && kolonisayisi<MAX_KOLONI_SAYISI) {
			 
			populasyon = scanner.nextInt();
			//Random random = new Random();
			String simge = rastgeleSembol();
			
				
				/*if(random2.nextInt(2) == 0) {
					ATaktik ataktik = new ATaktik(gecicitaktik);
					int yenitaktik = ataktik.taktik();
					koloniler[kolonisayisi].setTaktik(yenitaktik);
				}else {
					BTaktik btaktik = new BTaktik(gecicitaktik);
					int yenitaktik = btaktik.taktik();
					koloniler[i].setTaktik(yenitaktik);
				}
			*/
			
			koloniler[kolonisayisi] = new Koloni(simge,populasyon,kazanma,kaybetme,canli);
			//koloniler[kolonisayisi].setCanli(1);
			kolonisayisi++;
			
		}
		scanner.close();

		//while dongusu gelecek
		
		int oyun = 1;
		
		while(oyun == 1) {
		
			for(int t =0;t<kolonisayisi;t++) {
				koloniler[t].CanliMi();
			}
			Oyun bastir = new Oyun(koloniler,tur,kolonisayisi);
			bastir.kolonileriBastir();;
			bastir.setTur();
			tur++;
			
			int count = 0;
			
		
		
		
		
		//savas hazirlik
			for(int i = 0; i<kolonisayisi;i++) {
				
				gecicitaktik = koloniler[i].getTaktik();
				
				Random random2 = new Random();
				if(random2.nextInt(2) == 0) {
					ATaktik ataktik = new ATaktik(gecicitaktik);
					int yenitaktik = ataktik.taktik();
					koloniler[i].setTaktik(yenitaktik);
				}else {
					BTaktik btaktik = new BTaktik(gecicitaktik);
					int yenitaktik = btaktik.taktik();
					koloniler[i].setTaktik(yenitaktik);
				}
			}
			
			//savas
			//int uzunluk = kolonisayisi.length;
			
			for(int i = 0;i < kolonisayisi;i++) {
				if(koloniler[i].getCanli() == 0) {
					continue;
					
				}
				Koloni koloni1 = koloniler[i];
				for(int j = i + 1 ; j<kolonisayisi; j++) {
					//Koloni koloni2 = koloniler2[j];
					
					//int bak = koloniler[i+1].getCanli();
					if(koloniler[j].getCanli() == 0) {
						continue;
					}
					Koloni koloni2 = koloniler[j];
					
					Savas savas = new Savas(koloni1,koloni2);
					savas.savas();
					//savas.savas(koloniler[kolonisayisi]);
					koloni2 = savas.getKoloni2();
					koloniler[j] = koloni2;
					koloni1 = savas.getKoloni1();
					koloniler[i] = koloni1;
				}
				
				
			}
			
			
			
			
			//uretim
			
			for(int i =0;i<kolonisayisi;i++) {
				Random random = new Random();
				koloniler[i].populasyonArttir();
				koloniler[i].yemekStokazalt();
				//int geciciyemek = koloniler[i].getYemekstok();
				if(random.nextInt(2) == 0) {
					Auretim auretim = new Auretim(koloniler[i].getYemekstok());
					int yeniYemekstok = auretim.uret();
					koloniler[i].setYemekstok(yeniYemekstok);
				}else {
					Buretim buretim = new Buretim(koloniler[i].getYemekstok());
					int yeniYemekstok = buretim.uret();
					koloniler[i].setYemekstok(yeniYemekstok);
					
				}
				
			}
			//Oyunu Kontrol eder
			for(int k = 0;k<kolonisayisi;k++) {
				if(koloniler[k].getCanli() == 1) {
					count++;
				}
			}
			if(count<=1) {
				oyun = 0;
				
			}
			
			
			
			}
			
		}
}
