public class ogrenci extends personel {
  private String bolum;
  private String sinif;

  public ogrenci(String adi, String soyadi, String telno, String adres ,String mail,String personaldurum, String bolum,String sinif) {
	  super(adi, soyadi, telno,adres,mail,personaldurum); 
    this.bolum = bolum;
    this.sinif=sinif;
  } 

  public String getogrenciBilgi() {
    return bolum + " " + sinif;
  
  }
 
  public void yazdirBilgi() {
    super.yazdirBilgi();
    System.out.println("Öðrenci Bölümü ve Sýnýfý : " + getogrenciBilgi());
  }

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}  
  
  
  
}