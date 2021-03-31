

public class TestClass {
	
	public static void main(String[] args) {
		
		// musteriBilgiler Class� Testi
		
		System.out.println("musteriBilgiler Class Testi\n");
		musteriBilgiler musteriBilgi = new musteriBilgiler("00123", "Mehmet", "Yildirim", "�stanbul", "Erkek", "Bekar");
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: %s , %s %s , %s , %s , %s \n", musteriBilgi.getMusteriNo(),musteriBilgi.getAdi(), 
				musteriBilgi.getSoyadi(), musteriBilgi.getSehiri(), musteriBilgi.getCinsiyet(), musteriBilgi.getMedeniDurum()); //Yeni M��teri Kayd� Yap�ld� ve Yazd�r�ld�
		
		System.out.printf("Listeye M��teri Bilgileri Ekleniyor \n");
		musteriBilgi.musteriEkle("00124", "Mehmet", "Yildirim", "Bursa", "Kadin", "Evli"); //Listeye M��teri Eklendi
		musteriBilgi.musteriEkle("00125", "Necla", "Keskin", "Ordu", "Erkek", "Bekar"); //Listeye M��teri Eklendi
		System.out.printf("Listedeki M��teri Say�s�: %d \n", musteriBilgi.musteriSayisi());
		
		System.out.printf("Musterilerin G�ncel Cinsiyet Dagilim Orani: %d \n", musteriBilgi.cinsiyeteGoreDagilim());
		
		
		System.out.printf("Listedeki 1. M��teri Siliniyor..\n");
		musteriBilgi.musteriSil(0); // Listedeki M��teri Silindi
		System.out.printf("G�ncel Listedeki M��teri Say�s�: %d \n\n\n", musteriBilgi.musteriSayisi());
		
		
		
		
		
		// otelBilgi Class� Testi
		
		System.out.println("otelBilgi Class Testi\n");
		otelBilgi otelBilgisi = new otelBilgi("Aya Hall", true , 100 , "�stanbul", 4, 1);
		
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: Otel Ad�: %s , Hizmet Durumu: %s, Oda Say�s�: %d ,Konumu: %s ,Y�ld�z Say�s�: %d , Oda T�r�: %d \n", otelBilgisi.getOtelAdi(),otelBilgisi.isDurum(), 
				otelBilgisi.getOdaSayisi(), otelBilgisi.getBolge(), otelBilgisi.getYildizSayisi(), otelBilgisi.getOdaTurleri()); //Yeni Otel Kayd� Yap�ld� ve Yazd�r�ld�
		
		
		otelBilgisi.otelEkle("Irini Hall", true , 200 , "Ankara", 5, 4); // Listeye Otel Eklendi
		otelBilgisi.otelEkle("Truva Hotel", false , 100 , "�zmir", 5, 3); // Listeye Otel Eklendi
		
		otelBilgisi.otelSil(1); // Listeden Otel Silindi
		
		System.out.printf("\n\n");
		
		
		
		
		// odaBilgileri Class� Testi
		
		System.out.println("odaBilgileri Class Testi\n");
		odaBilgileri odaBilgisi = new odaBilgileri("Aya Hall", 30 , "Kral", 3250 , "Ultra Lux", "S�n�rs�z Yiyecek");
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: Otel Ad�: %s , Oda MetreKaresi: %d, Oda T�r�: %s ,Oda Fiyat�: %d ,Ekstra: %s , Ekstra 2: %s \n", odaBilgisi.getOtelAdi(),odaBilgisi.getMetrekare(), 
				odaBilgisi.getOdaTuru(), odaBilgisi.getFiyat(), odaBilgisi.getOzellik1(), odaBilgisi.getOzellik2()); //Yeni Oda Kayd� Yap�ld� ve Yazd�r�ld�
		
		
		odaBilgisi.odaEkle("Aya Hall", 20, "Normal", 1200, "A��k B�fe Yemek", ""); // Listeye Otel Odas� Eklendi
		odaBilgisi.odaEkle("Aya Hall", 20, "Normal", 1200, "A��k B�fe Yemek", ""); // Listeye Otel Odas� Eklendi
		System.out.printf("Ortalama Oda Fiyat�:%d\n", odaBilgisi.ortalamaOdaFiyat()); // Listedeki Oda Fiyatlar�ndan Ortalama Fiyat Hesaplan�yor
		
		odaBilgisi.odaSil(0);
		
		
		
		// otelGiderler Class� Testi
		
		System.out.printf("\n\n");
		System.out.println("otelGiderler Class Testi\n");
		otelGiderler otelGider = new otelGiderler("Kira", "Kira", 5, 1300000, "Nakit", "25/11/2020");
		System.out.printf("Bilgiler Kaydedildi, Getiriliyor: Gider Ad�: %s , Gider T�r�: %s, Komisyon Oran�: %d , Gider Miktar�: %d ,�deme Y�ntemi: %s , �deme Tarihi: %s \n", otelGider.getGiderAdi(),otelGider.getGiderTuru(), 
				otelGider.getKomisyonOrani(), otelGider.getToplamTutar(), otelGider.getOdemeTipi(), otelGider.getGiderTarihi()); //Otel Gider Kayd� Yap�ld� ve Yazd�r�ld�
		
		otelGider.giderEkle("Yemek Tak�m� Al�m�", "Mutfak", 18, 320000, "Taksit","26/11/2020"); //Listeye Gider Eklendi
		otelGider.giderEkle("Et Sat�n Al�m�", "Mutfak", 18, 50000, "Taksit","28/11/2020"); // Listeye Gider Eklendi
		
		System.out.printf("Toplam Gider Miktar� : %d TL'dir\n", otelGider.giderToplami()); // Toplam Gider Listeden �ekildi
		otelGider.giderSil(0); //Listedeki verilen Indexte Giderler Silindi
		otelGider.setYildizSayisi(2);//Otelin Y�ld�z Say�s� override Edildi
		
		
		
		
		
		
		
		// personelBilgisi Class� Testi
		
		System.out.printf("\n\n");
		System.out.println("personelBilgisi Class Testi\n");
		personelBilgisi personelBilgi = new personelBilgisi("Kemal","D�nmez","06/05/1990",4300,"Erkek", "M�d�r");
		System.out.printf("Personel Bilgileri Kaydedildi, Getiriliyor \n�sim: %s %s \nDo�um Tarihi: %s \nMaa�: %d \nCinsiyet: %s \nPozisyon: %s \n", personelBilgi.getAdi(),personelBilgi.getSoyAdi(), 
				personelBilgi.getDogumtarihi(), personelBilgi.getMaasi(), personelBilgi.getCinsiyeti(), personelBilgi.getUnvani()); //Yeni Personel Kayd� Yap�ld� ve Yazd�r�ld�
		
		
		personelBilgi.personelEkle("Atilla Bora","Yamuk","24/04/1983",2320,"Kadin","HouseKeeping"); //Listeye Personel Eklendi
		personelBilgi.personelEkle("Timur", "Sert", "01/04/1965", 6000, "Erkek", "Genel M�d�r"); //Listeye Personel Eklendi
		
		System.out.println("Toplam Personel Say�s�:" +personelBilgi.toplamPersonel()); // Toplam Personel Say�s�
		System.out.println("Toplam Personel Maa��:" +personelBilgi.toplamMaas());	// Toplam Personel Maa��
		System.out.println("Ortalama Personel Maa�:" +personelBilgi.ortalamaMaas()); // Ortalama Personel Maa��
		
		personelBilgi.personelSil(0); //Belirtilen Indexteki Personelin Listeden Silinmesi
		
		
	// POLYMORPHISM MusteriMilliyeti Class� Testi
		System.out.printf("\n\n");
		System.out.println("POLYMORPHISM MusteriMilliyeti Class� Testi\n");
		MusteriMilliyeti musteri = new Vatandaslik("T�rk","T�rkiye","YOK");
		musteri.bilgiler();
		
		
		
}
}
