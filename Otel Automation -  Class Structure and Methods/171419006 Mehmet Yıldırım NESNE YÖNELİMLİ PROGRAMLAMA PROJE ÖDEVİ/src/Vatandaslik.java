
public class Vatandaslik  extends MusteriMilliyeti{

		private String Suc;
		
		public Vatandaslik(String tur,String neredeYasiyor,String SucDurumu) {
			super(tur,neredeYasiyor);
			this.Suc=SucDurumu;
			}
		public void bilgiler() {
			super.bilgiler();
			System.out.println("Sabýka:"+ this.Suc);
			
			
		}
		
		
		
	}


