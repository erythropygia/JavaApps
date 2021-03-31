
public class ogretmen extends personel {
  private String maas;
  private String unvan;
  private String ofissaat;
  

 
  public ogretmen(String adi, String soyadi, String telno, String adres ,String mail,String personaldurum, String unvan, String ofissaat, String brans) {
    super(adi, soyadi, telno,adres,mail,personaldurum); 
    this.maas = brans;
    this.unvan=unvan;
    this.ofissaat=ofissaat;
    
  } 

  public String getogretmenBilgi() {
    return unvan + " , " + ofissaat + " , " + maas ;
  }
 
  /* Üst sýnýfta geçersiz hale getirilmiþ metod */
  public void yazdirBilgi() {
    super.yazdirBilgi();
    System.out.println("Öðretmen Unvaný, Ofis Saati ve Maaþý: " + getogretmenBilgi());
  }

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
} 
  
  
  
  
  
}