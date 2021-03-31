
public class javaprog {
  public static void main(String args[]){
    
    personel personel01 = new personel("Ahmet", "Kara", "05549917102" , "Ev No:1", "asd@gmail.com","Muhasebe Birimi");
    personel01.getPersonelBilgi("Muhasebe Ofisi", "4300");
    ogretmen ogretmen01 = new ogretmen("Nedim", "Sakin", "05318608149", "Ev No:2", "asd1@gmail.com","Akademi Birimi", "Profesör" ,"14.00-15.00","7500");
    ogrenci ogrenci01 = new ogrenci("Serdar", "Uzun", "05452145526", "Ev No:3", "asd2@gmail.com","Öðrenci","Bilgisayar Mühendisliði","2.Sýnýf");
 
    
    personel01.yazdirBilgi(); 
    personel01.yazdirOzelBilgi();
    System.out.printf("\n");
    ogretmen01.yazdirBilgi(); 
    System.out.printf("\n");
    ogrenci01.yazdirBilgi();  
    System.out.printf("\n");
    System.out.println("toString Override Ediliyor:");
    System.out.println(personel01.toString());
    System.out.println(ogretmen01.toString());
    System.out.println(ogrenci01.toString());
    
  }
}