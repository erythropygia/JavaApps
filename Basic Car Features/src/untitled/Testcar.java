package untitled;

public class Testcar {
	
		 		   
		public static void main(String[] args) {
			System.out.println("Default Bilgiler:");
			car car2 = new car();
			car2.showInfodef();
			
			advancedcar car4 = new advancedcar();
			car4.showInfodef();
			
			System.out.println("\n");
			
			
			
			
			car car1 = new car("Siyah","2019",2.0);
			car1.showInfo();

			advancedcar car3= new advancedcar(4,5,2);
			car3.showInfo();
			


			}	
			
		}
	 
		

		
		



