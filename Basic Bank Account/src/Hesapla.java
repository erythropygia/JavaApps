import java.util.Date;
public class Hesapla {
	
		private int id=0;
		private double bakiye=0;
		private double faizOraniYillik=0;
		private Date hesapAcilmaTarihi = new Date();
		
		public Hesapla() {
			
			System.out.println("id=" + id);
			System.out.println("yillik faiz orani="+faizOraniYillik);
			System.out.println("bakiye=" + bakiye);
			System.out.println("olusturulma tarihi=" + hesapAcilmaTarihi.toString());	
		}
		
		public Hesapla(int id, double bakiye) {
			this.id=id;
			this.bakiye=bakiye;
			
			System.out.println("id=" + id);
			System.out.println("bakiye=" + bakiye);
			System.out.println("olusturulma tarihi=" + hesapAcilmaTarihi.toString());	
		}
		
		
		public void getAylikFaizOrani() {
			faizOraniYillik=0.45;
			System.out.println("aylik faiz orani=%" +(faizOraniYillik/12));
			
		}
		
		public void getAylikFaiz(double bakiye) {
			this.bakiye=bakiye;
			System.out.println("anaparadan aylik faiz geliri:"+ bakiye*(faizOraniYillik/12) + "tl'dir");
				
		}


		public void paraCekme(double paracek) {
		
			if(paracek>bakiye) {
				System.out.println("Belirtilen Miktari Cekemezsiniz");
			}
			else {
				
				bakiye=bakiye-paracek;
				System.out.println("para cekildi. yeni hesap bakiyeniz:"+bakiye);
				
			}
			

		}
		
		public void paraYatir(double parayatir) {
			
			bakiye=bakiye+parayatir;
			System.out.println("para yatirildi. yeni hesap bakiyeniz:"+bakiye);
			
		}
		
		public void yazdir() {
			
			System.out.println("id=" + id);
			System.out.println("bakiye=" + bakiye);
			System.out.println("olusturulma tarihi=" + hesapAcilmaTarihi.toString());
			
			
		}
		

	


}
