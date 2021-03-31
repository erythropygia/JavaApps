

public class TestClass {
	
	public static void main(String[] args) {
		
		// musteriBilgiler Classý Testi
		
		System.out.println("musteriBilgiler Class Testi\n");
		musteriBilgiler musteriBilgi = new musteriBilgiler("00123", "Mehmet", "Yildirim", "Ýstanbul", "Erkek", "Bekar");
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: %s , %s %s , %s , %s , %s \n", musteriBilgi.getMusteriNo(),musteriBilgi.getAdi(), 
				musteriBilgi.getSoyadi(), musteriBilgi.getSehiri(), musteriBilgi.getCinsiyet(), musteriBilgi.getMedeniDurum()); //Yeni Müþteri Kaydý Yapýldý ve Yazdýrýldý
		
		System.out.printf("Listeye Müþteri Bilgileri Ekleniyor \n");
		musteriBilgi.musteriEkle("00124", "Mehmet", "Yildirim", "Bursa", "Kadin", "Evli"); //Listeye Müþteri Eklendi
		musteriBilgi.musteriEkle("00125", "Necla", "Keskin", "Ordu", "Erkek", "Bekar"); //Listeye Müþteri Eklendi
		System.out.printf("Listedeki Müþteri Sayýsý: %d \n", musteriBilgi.musteriSayisi());
		
		System.out.printf("Musterilerin Güncel Cinsiyet Dagilim Orani: %d \n", musteriBilgi.cinsiyeteGoreDagilim());
		
		
		System.out.printf("Listedeki 1. Müþteri Siliniyor..\n");
		musteriBilgi.musteriSil(0); // Listedeki Müþteri Silindi
		System.out.printf("Güncel Listedeki Müþteri Sayýsý: %d \n\n\n", musteriBilgi.musteriSayisi());
		
		
		
		
		
		// otelBilgi Classý Testi
		
		System.out.println("otelBilgi Class Testi\n");
		otelBilgi otelBilgisi = new otelBilgi("Aya Hall", true , 100 , "Ýstanbul", 4, 1);
		
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: Otel Adý: %s , Hizmet Durumu: %s, Oda Sayýsý: %d ,Konumu: %s ,Yýldýz Sayýsý: %d , Oda Türü: %d \n", otelBilgisi.getOtelAdi(),otelBilgisi.isDurum(), 
				otelBilgisi.getOdaSayisi(), otelBilgisi.getBolge(), otelBilgisi.getYildizSayisi(), otelBilgisi.getOdaTurleri()); //Yeni Otel Kaydý Yapýldý ve Yazdýrýldý
		
		
		otelBilgisi.otelEkle("Irini Hall", true , 200 , "Ankara", 5, 4); // Listeye Otel Eklendi
		otelBilgisi.otelEkle("Truva Hotel", false , 100 , "Ýzmir", 5, 3); // Listeye Otel Eklendi
		
		otelBilgisi.otelSil(1); // Listeden Otel Silindi
		
		System.out.printf("\n\n");
		
		
		
		
		// odaBilgileri Classý Testi
		
		System.out.println("odaBilgileri Class Testi\n");
		odaBilgileri odaBilgisi = new odaBilgileri("Aya Hall", 30 , "Kral", 3250 , "Ultra Lux", "Sýnýrsýz Yiyecek");
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: Otel Adý: %s , Oda MetreKaresi: %d, Oda Türü: %s ,Oda Fiyatý: %d ,Ekstra: %s , Ekstra 2: %s \n", odaBilgisi.getOtelAdi(),odaBilgisi.getMetrekare(), 
				odaBilgisi.getOdaTuru(), odaBilgisi.getFiyat(), odaBilgisi.getOzellik1(), odaBilgisi.getOzellik2()); //Yeni Oda Kaydý Yapýldý ve Yazdýrýldý
		
		
		odaBilgisi.odaEkle("Aya Hall", 20, "Normal", 1200, "Açýk Büfe Yemek", ""); // Listeye Otel Odasý Eklendi
		odaBilgisi.odaEkle("Aya Hall", 20, "Normal", 1200, "Açýk Büfe Yemek", ""); // Listeye Otel Odasý Eklendi
		System.out.printf("Ortalama Oda Fiyatý:%d\n", odaBilgisi.ortalamaOdaFiyat()); // Listedeki Oda Fiyatlarýndan Ortalama Fiyat Hesaplanýyor
		
		odaBilgisi.odaSil(0);
		
		
		
		// otelGiderler Classý Testi
		
		System.out.printf("\n\n");
		System.out.println("otelGiderler Class Testi\n");
		otelGiderler otelGider = new otelGiderler("Kira", "Kira", 5, 1300000, "Nakit", "25/11/2020");
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: Gider Adý: %s , Gider Türü: %s, Komisyon Oraný: %d , Gider Miktarý: %d ,Ödeme Yöntemi: %s , Ödeme Tarihi: %s \n", otelGider.getGiderAdi(),otelGider.getGiderTuru(), 
				otelGider.getKomisyonOrani(), otelGider.getToplamTutar(), otelGider.getOdemeTipi(), otelGider.getGiderTarihi()); //Otel Gider Kaydý Yapýldý ve Yazdýrýldý
		
		otelGider.giderEkle("Yemek Takýmý Alýmý", "Mutfak", 18, 320000, "Taksit","26/11/2020"); //Listeye Gider Eklendi
		otelGider.giderEkle("Et Satýn Alýmý", "Mutfak", 18, 50000, "Taksit","28/11/2020"); // Listeye Gider Eklendi
		
		System.out.printf("Toplam Gider Miktarý : %d TL'dir\n", otelGider.giderToplami()); // Toplam Gider Listeden Çekildi
		otelGider.giderSil(0); //Listedeki verilen Indexte Giderler Silindi
		otelGider.setYildizSayisi(2);//Otelin Yýldýz Sayýsý override Edildi
		
		
		
		
		
		
		
		// personelBilgisi Classý Testi
		
		System.out.printf("\n\n");
		System.out.println("personelBilgisi Class Testi\n");
		personelBilgisi personelBilgi = new personelBilgisi("Kemal","Dönmez","06/05/1990",4300,"Erkek", "Müdür");
		System.out.printf("Personel Bilgileri Kaydedildi, Getiriliyor \nÝsim: %s %s \nDoðum Tarihi: %s \nMaaþ: %d \nCinsiyet: %s \nPozisyon: %s \n", personelBilgi.getAdi(),personelBilgi.getSoyAdi(), 
				personelBilgi.getDogumtarihi(), personelBilgi.getMaasi(), personelBilgi.getCinsiyeti(), personelBilgi.getUnvani()); //Yeni Personel Kaydý Yapýldý ve Yazdýrýldý
		
		
		personelBilgi.personelEkle("Atilla Bora","Yamuk","24/04/1983",2320,"Kadin","HouseKeeping"); //Listeye Personel Eklendi
		personelBilgi.personelEkle("Timur", "Sert", "01/04/1965", 6000, "Erkek", "Genel Müdür"); //Listeye Personel Eklendi
		
		System.out.println("Toplam Personel Sayýsý:" +personelBilgi.toplamPersonel()); // Toplam Personel Sayýsý
		System.out.println("Toplam Personel Maaþý:" +personelBilgi.toplamMaas());	// Toplam Personel Maaþý
		System.out.println("Ortalama Personel Maaþ:" +personelBilgi.ortalamaMaas()); // Ortalama Personel Maaþý
		
		personelBilgi.personelSil(0); //Belirtilen Indexteki Personelin Listeden Silinmesi
		
		
	// POLYMORPHISM MusteriMilliyeti Classý Testi
		System.out.printf("\n\n");
		System.out.println("POLYMORPHISM MusteriMilliyeti Classý Testi\n");
		MusteriMilliyeti musteri = new Vatandaslik("Türk","Türkiye","YOK");
		musteri.bilgiler();
		
		
		
}
}
