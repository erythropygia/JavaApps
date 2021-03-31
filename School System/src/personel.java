import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class personel {
  public String adi;    
  public String soyadi; 
  private String telno;
  private String adres;
  private String mail;
  private String personaldurum;
  private String personelmaas;
  private String personelofis;
  public Date isegiris = new Date();

  public personel(String adi, String soyadi, String telno, String adres ,String mail,String personaldurum) {
    this.adi = adi;
    this.soyadi = soyadi;
    this.telno=telno;
    this.adres=adres;
    this.mail=mail;
    this.personaldurum=personaldurum;
  } 
  
  
  public void getPersonelBilgi(String personelofis, String personelmaas) {
	  this.personelmaas=personelmaas;
	  this.personelofis=personelofis;
	 
	   
  }


  public String getBilgi() {
    return adi + " " + soyadi + ",";
  }
 
 
  public String getPrivBilgi() {
    return "Telefon:" + telno + " " + "Adres:" + adres + " " + "Mail:" + mail + " " + "Birim:" + personaldurum;
  }
  
  
  public void yazdirBilgi() {
    System.out.println("Okulumuz Bünyesinde Bulunan : " + getBilgi() + " " + getPrivBilgi() + " 'de Bulunmaktadýr");
  }  
  
  public void yazdirOzelBilgi() { 
	  Calendar takvim = new GregorianCalendar(1996, 9, 6);
      this.isegiris = takvim.getTime();
	  System.out.println("Personel Ofisi:" + personelofis + " , " + "Personel Maaþý:" + personelmaas + " " + "Ýþe Alýnma Tarihi:" + isegiris.toString());
  }


  @Override
  public String toString() {
  	// TODO Auto-generated method stub
  	return super.toString() ;
  	
  }  
  	  

	  
	  
	  
	  
	  
	  
	  
	
	  
 }
  
  
  
  
  
