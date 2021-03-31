package application;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;



public class Main extends JFrame {
	
	private static JFrame frame;
	
	Calendar takvim;
	int saat;
	int dakika;
	int saniye;
	Color SaniyeRengi,DakikaSaatRengi,SayilarinRengi;
	Timer timer;
	TimeZone timeZone;
	
	
	private int durum=0;
	private static final int SaatCizgileriOrtala= 35;
	private static final float radyanSaniyeDakika = (float)(Math.PI / 30.0);
	private static final float radyanNumara = (float)(Math.PI/ -6);
	
	private int merkezX;
	private int merkezY;
	
	private int boyut;


	

	public Main() {
		
		setBounds(400, 400, 400, 400);
		getContentPane().setBackground(new Color(10, 5, 20));

		timer = new Timer();
		timeZone = TimeZone.getDefault();
		timer.schedule(new TakvimVerisi(), 0, 1000); // Bilgileri göndermeden güncelleniyor
		
	}
	
	
	class TakvimVerisi extends TimerTask{

		@Override
		public void run() {
		
			takvim = (Calendar) Calendar.getInstance(timeZone);
			repaint();// her saniye bilgiler tekrar alýnýp þekil tekrar çizilecek
		}
		
	}
	
	
	@Override
	public void paint(Graphics Saat) {
		super.paint(Saat);	
		
		if(durum == 0){
			Saat.setColor(new Color(50, 50, 50));
			Saat.fillOval(25, SaatCizgileriOrtala, 350, 350);	
			Saat.setColor(Color.WHITE);
			Saat.fillOval(35, SaatCizgileriOrtala+10, 330, 330);
		}else if(durum == 1){
			Saat.setColor(Color.BLACK);
			Saat.fillOval(25, SaatCizgileriOrtala, 350, 350);	
			Saat.setColor(Color.WHITE);
			Saat.fillOval(35, SaatCizgileriOrtala+10, 330, 330);
		}

		boyut = 400 -SaatCizgileriOrtala;		
		merkezX = 400/2;
		merkezY = 400/2+10;
					
		
		SaatiCiz(Saat);
		SaatNumaraCiz(Saat);

		saat = takvim.get(Calendar.HOUR);
		dakika = takvim.get(Calendar.MINUTE);
		saniye = takvim.get(Calendar.SECOND);	
		
		if(durum==2){
			SaatKollarýCiz(Saat,saat,dakika,saniye,SaniyeRengi,DakikaSaatRengi);
		}else{
			SaatKollarýCiz(Saat,saat,dakika,saniye,SaniyeRengi,DakikaSaatRengi);
		} //Saat Kollarýný çiziyor

		
		Saat.setColor(Color.PINK);
		Saat.fillOval(merkezX-5, merkezY-5, 10, 10);
		Saat.setColor(Color.GRAY);
		Saat.fillOval(merkezX-3, merkezY-3, 6, 6);
		//Merkez Noktasý Daireleri	
	}


	private void SaatiCiz(Graphics Saat) {
		
		
		
		for (int sec = 0; sec<60; sec++) {
			int tikCiz;
			
			// Tiklerin Çizimi
			if (sec%5 == 0) {
				tikCiz = (boyut/2)-10;
			}else{
				tikCiz = (boyut/2)-5;
			}
			
			if(durum ==2){
				YaricapCiz(Saat, merkezX, merkezY, radyanSaniyeDakika*sec, tikCiz-20, boyut/2-20,SayilarinRengi.BLACK);
			}else{
				YaricapCiz(Saat, merkezX, merkezY, radyanSaniyeDakika*sec, tikCiz-20, boyut/2-20,SayilarinRengi.BLACK);
			}
			
		}
	}
	
	private void YaricapCiz(Graphics Saat, int x, int y, double aci, int minYaricap, int maxYaricap, Color SayilarinRengi) {
		
			float sin = (float)Math.sin(aci);
			float cos = (float)Math.cos(aci);
			int X_minimum = (int)(minYaricap * sin);
			int Y_minimum = (int)(minYaricap * cos);
			int X_maksimum = (int)(maxYaricap * sin);
			int Y_maksimum = (int)(maxYaricap * cos);
			Saat.setColor(SayilarinRengi);
			Saat.drawLine(x+X_minimum, y+Y_minimum, x+X_maksimum, y+Y_maksimum);
	}
	
	
	private void SaatNumaraCiz(Graphics Saat) {
		
		for(int i=12;i>0;i--){			
			SayilariYerlestir(Saat,radyanNumara*i,i);			
		}
	}

	private void SayilariYerlestir(Graphics Saat, float aci,int DuzeltmeNoktasi) {
		
		float sin = (float)Math.sin(aci);
		float cos = (float)Math.cos(aci);
		int X_noktasi = (int)((boyut/2-20-25) * -sin);
		int Y_noktasi = (int)((boyut/2-20-25) * -cos);		
		
		Saat.drawString(" "+DuzeltmeNoktasi, X_noktasi+merkezX-5 , Y_noktasi+merkezY+5);
	}

	
	
	
	private void SaatKollarýCiz(Graphics Saat, double saat, double dakika, double saniye, Color SaniyeRengi, Color DakikaSaatRengi) {
		
		double Tsaniye = (saniye*6)*(Math.PI)/180;
		double Tdakika = ((dakika + (saniye / 60)) * 6) * (Math.PI) / 180;
		double Tsaat = ((saat + (dakika / 60)) * 30) * (Math.PI) / 180;
				
		Saat.setColor(SaniyeRengi);
		Saat.drawLine(merkezX, merkezY, merkezX + (int) (150 * Math.cos(Tsaniye - (Math.PI / 2))), merkezY + (int) (150 * Math.sin(Tsaniye - (Math.PI / 2))));
		Saat.setColor(DakikaSaatRengi);
		Saat.drawLine(merkezX, merkezY, merkezX + (int) (120 * Math.cos(Tdakika - (Math.PI / 2))), merkezY + (int) (120 * Math.sin(Tdakika - (Math.PI / 2))));
		Saat.drawLine(merkezX, merkezY, merkezX + (int) (90 * Math.cos(Tsaat - (Math.PI / 2))), merkezY + (int) (90 * Math.sin(Tsaat - (Math.PI / 2))));
	}

	
	
	
	public static void main(String args[]){
		frame = new Main();
		frame.setTitle("Java FX Analog Saat");
		frame.setVisible(true);
	}
	
}