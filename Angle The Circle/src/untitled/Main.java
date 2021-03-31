package untitled;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			double yaricap=40.0;
			double dot1=Math.random()*360;
			double dot2=Math.random()*360;
			double dot3=Math.random()*360;
			dot1=Math.toRadians(dot1);
			dot2=Math.toRadians(dot2);
			dot3=Math.toRadians(dot3);
			
			double xkonum1= yaricap* Math.cos(dot1);
			double ykonum1= yaricap* Math.sin(dot1);
			
			
			double xkonum2= yaricap* Math.cos(dot2);
			double ykonum2= yaricap* Math.sin(dot2);

			
			double xkonum3= yaricap* Math.cos(dot3);
			double ykonum3= yaricap* Math.sin(dot3);
		
			
			System.out.printf("1. Cember Ustu Nokta = X:%f , Y:%f \n",xkonum1,ykonum1);
			System.out.printf("2. Cember Ustu Nokta = X:%f , Y:%f \n",xkonum2,ykonum2);
			System.out.printf("3. Cember Ustu Nokta = X:%f , Y:%f \n",xkonum3,ykonum3);
			
			double kose1= Math.pow(xkonum2-xkonum1, 2)+ Math.pow(ykonum2-ykonum1, 2);
			kose1=Math.sqrt(kose1);
			System.out.printf("1. Kose Uzunlugu=%f \n",kose1);
			
			double kose2= Math.pow(xkonum3-xkonum2, 2)+ Math.pow(ykonum3-ykonum2, 2);
			kose2=Math.sqrt(kose2);
			System.out.printf("2. Kose Uzunlugu=%f\n",kose2);
			
			double kose3= Math.pow(xkonum3-xkonum1, 2)+ Math.pow(ykonum3-ykonum1, 2);
			kose3=Math.sqrt(kose3);
			System.out.printf("3. Kose Uzunlugu=%f\n",kose3);
			
			double aci1= ((-1)*Math.pow(kose1,2)+Math.pow(kose2, 2)+Math.pow(kose3,2))/(2*kose2*kose3);
			aci1=Math.acos(aci1);
			aci1=Math.toDegrees(aci1);
			System.out.printf("1. Kosenin Acisi %f\n", aci1);
			
			double aci2= ((-1)*Math.pow(kose2,2)+Math.pow(kose1, 2)+Math.pow(kose3,2))/(2*kose1*kose3);
			aci2=Math.acos(aci2);
			aci2=Math.toDegrees(aci2);
			System.out.printf("2. Kosenin Acisi %f\n", aci2);
			
			double aci3= ((-1)*Math.pow(kose3,2)+Math.pow(kose1, 2)+Math.pow(kose2,2))/(2*kose1*kose2);
			aci3=Math.acos(aci3);
			aci3=Math.toDegrees(aci3);
			System.out.printf("3. Kosenin Acisi %f\n", aci3);
			
			
			

		}
	}
