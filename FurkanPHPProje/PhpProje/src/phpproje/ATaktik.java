package phpproje;

import java.util.Random;

public class ATaktik extends Taktik {
	public int ataktik;
	public ATaktik(int taktik) {
		super(taktik);
		this.ataktik = ataktik();		
	}
	
	@Override
	public int taktik() {
		int yenitaktik = ataktik;
		
		return yenitaktik;
		
	}
	
	
	public int ataktik() {
		int min = 0;
		int max = 800;
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	
}
