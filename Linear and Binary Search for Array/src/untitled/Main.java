package untitled;
import java.util.Scanner;
import java.util.Random;

 class Main {
	 public static int linearsearch(int arr[], int x) { 
		    int n = arr.length; 
		    for(int i = 0; i < n; i++) { 
		        if(arr[i] == x) 
		            return i; 
		    } 
		    return -1; 
		}
	 
	 
	 
	 
	 public static int binarysearch(int arr[], int x) {
		  int n = arr.length;
		  int temp=0;
		  for(int i=0;i<n-1;i++) {
			  for(int j=i+1;j<n;j++) {
			  
			  if(arr[i]>arr[j]) {
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
			 } 
		    }
		  System.out.printf("Ikili Arama Icin Dizi Siralaniyor:\n");
		  for(int i=0;i<n;i++) {
			  System.out.printf("%d-) %d \n",i,arr[i]);
		  }
		  
		  
		  
		  if(arr[n/2]== x) {
			  return x;
		  }
		  
		  
		  if(arr[n/2]<x) {
			  for(int i=n/2;i<=n;i++) {
				  if(arr[i]==x) {
				  return i;
			  }
			 }
		    }
		  
		  else {
			  for(int i=n/2;i>0;i--) {
				  if(arr[i]==x) {
					  return i;
				  }
				  
			  }
			  
		  }
		  
		 return -1; 
	 }
	
	public static void main(String[] args) {
		int dizi[]=new int[100];
		Random r=new Random();
		System.out.printf("Rastgele Liste Olusturuldu:\n");
		for(int i=0;i<100;i++) {
			int uret=r.nextInt(101);
			dizi[i]=uret;
			System.out.printf("%d-)%d\n",i,dizi[i]);
		}
		System.out.println("Dizide Dogrusal ve Ikili Arama Ile Aranacak Sayiyi Giriniz:");
		Scanner sc= new Scanner(System.in);
		int girilen=sc.nextInt();
		
		int dogrusalgonder=Main.linearsearch(dizi,girilen);
		if(dogrusalgonder==-1) {
			System.out.print("Dogrusal Arama Ile Girilen Sayi Dizide Yoktur\n");
		}
		else {
			System.out.print("Dogrusal Arama ile Girilen Sayi " + dogrusalgonder +". Indiste Bulunmustur\n");
		}
		
		int ikiligonder=Main.binarysearch(dizi, girilen);
		if(ikiligonder==-1) {
			System.out.print("Ikili Arama ile Girilen Sayi Dizide Yoktur\n");
		}
		else {
			System.out.print("Ýkili Arama ile Girilen Sayi " + ikiligonder +". Indiste Bulunmustur\n");
		}
		
		
		
	
		
		}
	

	
	}
	
