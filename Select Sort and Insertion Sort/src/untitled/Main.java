package untitled;
import java.util.Scanner;
import java.util.Random;

 class Main {
	 
	 
	 public static void selectsort(int arr[]) { 
		    int n = arr.length; 
		    int temp=0;
		    for(int i = 0; i < n; i++) {
		    	for(int j=0;j<i;j++) {
		    		 if(arr[i] < arr[j]) {
		    			 temp=arr[i];
		    			 arr[i]=arr[j];
		    			 arr[j]=temp;
		    		 }  
		    	} 
		    } 
		   for(int i=0;i<n;i++) {
			   
			   System.out.printf("%d-)%d\n",i,arr[i]);
			   
		   }
  
		}
	 
	 public static void insertionsort(int arr[]) { 
		    int n = arr.length; 
		    int temp=0;
		    for(int i=1;i<n;i++) {
		    		if(arr[i]<arr[i-1]) {
		    			temp=arr[i];
		    			arr[i]=arr[i-1];
		    			arr[i-1]=temp;
		    			i=0;
		    			
		    		}		    		    
		    }
		    for(int i=0;i<n;i++) {
				   
				   System.out.printf("%d-)%d\n",i,arr[i]);
				   
			   }
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
		
		System.out.println("Secmeli sýralama (Selection sort) Icin '1', Yerlestirmeli sýralama (insertion sort) Icin '2' Giriniz:");
		Scanner sc= new Scanner(System.in);
		int girilen=sc.nextInt();

		if(girilen==1) {
			
			selectsort(dizi);
				
		}
		else if(girilen==2) {
			
			insertionsort(dizi);
			
		}
		else {
			System.out.printf("Hatali Giris");
			
		}	
	}
	

	
	}
	
