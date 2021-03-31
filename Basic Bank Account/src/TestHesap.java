import java.util.Scanner;
public class TestHesap {

		public static void main(String[] args) {
			
			
			System.out.println("Varsayilan Degerlerle Otomatik Hesap Oluþturuldu:");
			Hesapla randomhesapolustur = new Hesapla();
			
			
			System.out.println("Lutfen Hesap Id'si Giriniz:");
			Scanner sc= new Scanner(System.in);
			int id=sc.nextInt();
			System.out.println("Lutfen Hesap Bakiyesi Giriniz:");
			double bakiye=sc.nextDouble();
			Hesapla hesapolustur= new Hesapla(id,bakiye);
			
		
			hesapolustur.getAylikFaizOrani();
			hesapolustur.getAylikFaiz(bakiye);
			
			
			System.out.println("Lutfen Hesaptan Cekmek Istediginiz Miktarý Giriniz:");
			double paracek=sc.nextDouble();
			hesapolustur.paraCekme(paracek);
			
			System.out.println("Lutfen Hesaba Yatirmak Istediginiz Miktarý Giriniz:");
			double parayatir=sc.nextDouble();
			hesapolustur.paraYatir(parayatir);
			
			
			System.out.println("\n\nHesap Bilgileri Yazdiriliyor");
			hesapolustur.yazdir();

		}

	}

	
	
	
	


