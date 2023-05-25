package phpproje;
import java.util.Random;
public class Auretim extends Uretim {
	//public int auretim;
	public Auretim(int yemekstok) {
		super(yemekstok);
		//this.auretim = auretim();
	}
	@Override
	public int uret() {
		int yeniYemekStok = getYemekstok() + auretim();
		
		return yeniYemekStok;
	}
	private int auretim() {
        Random random = new Random();
        return random.nextInt(6) + 5; // 5-10 arası rastgele bir sayı üret
    }
}
