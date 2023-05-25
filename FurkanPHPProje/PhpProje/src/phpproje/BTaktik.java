package phpproje;

import java.util.Random;

	public class BTaktik extends Taktik {
		public int btaktik;
		public BTaktik(int taktik) {
			super(taktik);
			this.btaktik = btaktik();		
		}
		
	

		@Override
		public int taktik() {
			int yenitaktik = btaktik;
			
			return yenitaktik;
			
		}
		
		
		public int btaktik() {
			int min = 200;
			int max = 999;
			Random random = new Random();
			return random.nextInt(max - min + 1) + min;
		}



		
}
