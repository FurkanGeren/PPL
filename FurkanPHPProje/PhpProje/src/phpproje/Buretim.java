package phpproje;
import java.util.Random;

public class Buretim extends Uretim {
	//public int buretim;
	public Buretim(int yemekstok) {
		super(yemekstok);
		//this.buretim = buretim();
	}
	@Override
	public int uret() {
		int yeniYemekStok = getYemekstok() + buretim();
		
		return yeniYemekStok;
	}
	int buretim() {
        Random random = new Random();
        return random.nextInt(5) + 1; // 1-5 arası rastgele bir sayı üret
    }
}
