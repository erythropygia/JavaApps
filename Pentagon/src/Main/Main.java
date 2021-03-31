package untitled;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Besgenin Merkez-Kose Uzunlugu:");
		Scanner sc= new Scanner(System.in);
		int uzunluk=sc.nextInt();
		double radyan= Math.toRadians(72);
		double alan= (0.5*uzunluk*uzunluk*Math.sin(radyan))*5.0;
		System.out.println("Besgenin Alani:"+ alan);
		}
	}


