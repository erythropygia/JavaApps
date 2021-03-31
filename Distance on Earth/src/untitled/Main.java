package untitled;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Guney ve Dogu Girisleri Icin Negatif Kullaniniz(Nokta Yerine Virgul Kullaniniz)");
		
		
		System.out.println("Ilk Noktanin Enlemini Derece Olarak Giriniz:");
		Scanner sc= new Scanner(System.in);
		double enlem1=sc.nextDouble();
		enlem1=Math.toRadians(enlem1);
		
		System.out.println("Ilk Noktanin Boylamini Derece Olarak Giriniz:");
		double boylam1=sc.nextDouble();
		boylam1=Math.toRadians(boylam1);
		
		System.out.println("Ikinci Noktanin Enlemini Derece Olarak Giriniz:");
		double enlem2=sc.nextDouble();
		enlem2=Math.toRadians(enlem2);
		
		System.out.println("Ilk Noktanin Boylamini Derece Olarak Giriniz:");
		double boylam2=sc.nextDouble();
		boylam2=Math.toRadians(boylam2);
		
		double worldradius=6371.01;
		double mesafe= worldradius * Math.acos(Math.sin(enlem1) * Math.sin(enlem2) + Math.cos(enlem1)* Math.cos(enlem2)* Math.cos(boylam1-boylam2) );
		
		System.out.printf("Iki Nokta Arasý Uzaklýk: %f KM'dir",mesafe);
		
		
		}
	}


