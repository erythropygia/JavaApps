package untitled;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Nokta Sayisini Giriniz:");
		Scanner sc= new Scanner(System.in);
		int nokta=sc.nextInt();
		int icerdekinokta=0;
		for(int i=0;i<nokta;i++) {
			double x=Math.random();
			double y=Math.random();
			double uzaklik= Math.sqrt(x*x+y*y);
			if(uzaklik<=1) 
				icerdekinokta++;
			
		}
			
			double yakinsapi = 4.0 * icerdekinokta / nokta;
			System.out.println("Monte Carlo Teoremine Gore Yakinsadigimiz Pi Degerimiz:"+yakinsapi);
			System.out.println("Java'nýn Pi Degeri:"+ Math.PI);
		}
	}


