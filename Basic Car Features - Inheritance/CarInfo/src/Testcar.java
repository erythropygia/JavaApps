import java.util.ArrayList;
public class Testcar {
	
		 		   
		public static void main(String[] args) {
			System.out.println("Default Bilgiler:");
			car car2 = new car();
			car2.showInfodef();
			
			advancedcar car4 = new advancedcar();
			car4.showInfodef();
			
			System.out.println("\n");
			System.out.println("Bilgiler:");
			car car1 = new car("Siyah","2019",2.0);
			car1.showInfo();

			advancedcar car3= new advancedcar(4,5,2);
			car3.showInfo();
			
			System.out.println("\n");
			
			System.out.println("Method Overloading Default Bilgiler:");
			car car5=new car("Mor",3.0);
			car5.showInfo();
			
			System.out.println("\n");
			
			System.out.println("Inheritance Bilgileri:");
			superclass superclass = new superclass("Mavi","2017",2.5);
			superclass.showInfo();
			
			System.out.println("\n");
			

			System.out.println("ArrayListte Yakalanan Araç Marka ve Modelleri:");
			sahipler sahip=new sahipler("BMW","3.30");
			sahipler sahip1=new sahipler("Mercedes","Maybach");
			ArrayList<sahipler> liste = new ArrayList<sahipler>();
			liste.add(sahip);
			liste.add(sahip1);
			
			for(sahipler ssahip:liste) {
				
				System.out.println(ssahip.MarkaModel());
				
			}
	
	

			
			
			
			

			}	
}
		
	 
		

		
		



