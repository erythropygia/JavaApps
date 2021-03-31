//POLYMORPHISM UYGULAMASI
public	class MusteriMilliyeti{
		private String tur;
		private String neredeYasiyor;

		public MusteriMilliyeti(String tur,String neredeYasiyor) {
			this.tur = tur;
			this.neredeYasiyor=neredeYasiyor;
		}
		
		public void bilgiler() {
			
			System.out.println("Milliyeti:"+this.tur);
			System.out.println("Nerede Yaþýyor:"+this.neredeYasiyor);
		}
}


