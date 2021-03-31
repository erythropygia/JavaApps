import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer>liste=new ArrayList<Integer>();
		int sayac=0;
		
		while(sayac<10) {
			System.out.printf("Lütfen Listenin %d. Sayisini Giriniz: ", sayac+1);
			liste.add(sc.nextInt());
			sayac++;				
		}
		
		System.out.printf("Girdiðiniz Dizi: ");
		for(int i=0;i<liste.size();i++) {
			System.out.printf("%d ", liste.get(i));
			
		}
		System.out.printf("\n");
		removeDuplicate(liste);
		sc.close();

	}
	
	public static void removeDuplicate (ArrayList<Integer>sayilar) {
		
		for(int i=0;i<sayilar.size();i++) {
			for(int j=1;j<sayilar.size();j++) {
				if(sayilar.get(i)==sayilar.get(j) && i!=j) {
					sayilar.remove(j);
					j=0;
					
				}
				
			}
			
		}
		
			System.out.printf("Tekrarsýz Dizi: ");
			for(int i=0;i<sayilar.size();i++) {
				System.out.printf("%d ", sayilar.get(i));
				
			}
		
		
		}
		



		
		
		
	

		
		
		
	}
	
	
	
	
	
	
	
	


