package application;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


public class SaatCiz extends Pane {
	private int saat;
	private int dakika;
	private int saniye;
	private double genislik = 250, yukseklik = 250;

	public SaatCiz() {
		setMevcutZaman();
	}


	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
		saatCizim();
	}
	
	public int getDakika() {
		return dakika;
	}

	public void setDakika(int dakika) {
		this.dakika = dakika;
		saatCizim();
	}

	public int getSaniye() {
		return saniye;
	}

	public void setSaniye(int saniye) {
		this.saniye = saniye;
		saatCizim();
	}

	public double getGenislik() {
		return genislik;
	}

	public void setGenislik(double genislik) {
		this.genislik = genislik;
		saatCizim();
	}

	public double getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
		saatCizim();
	}
	

	
	public void setMevcutZaman() {
		// Construct a Calendar for the current date and time
		Calendar takvim = new GregorianCalendar();

		// Set current hour, minute and second
		this.saat = takvim.get(Calendar.HOUR_OF_DAY);
		this.dakika = takvim.get(Calendar.MINUTE);
		this.saniye = takvim.get(Calendar.SECOND);

		saatCizim(); // Repaint the clock
	}
	

	protected void saatCizim() {
		
		double saatYaricap = Math.min(genislik, yukseklik) * 0.8 * 0.5;
		double merkezX = genislik / 2;
		double merkezY = yukseklik / 2;

	
		Circle daire = new Circle(merkezX, merkezY, saatYaricap);
		daire.setFill(Color.RED);
		daire.setStroke(Color.AQUA);
		Text Yazi1 = new Text(merkezX - 5, merkezY - saatYaricap + 12, "12");
		Text Yazi2 = new Text(merkezX - saatYaricap + 3, merkezY + 5, "9");
		Text Yazi3 = new Text(merkezX + saatYaricap - 10, merkezY + 3, "3");
		Text Yazi4 = new Text(merkezX - 3, merkezY + saatYaricap - 3, "6");

		// Draw second hand
		double sUzunluk = saatYaricap * 0.8;
		double saniyeX = merkezX + sUzunluk * Math.sin(saniye * (2 * Math.PI / 60));
		double secondY = merkezY - sUzunluk * Math.cos(saniye * (2 * Math.PI / 60));
		Line saniyeLine = new Line(merkezX, merkezY, saniyeX, secondY);
		saniyeLine.setStroke(Color.GREY);

		// Draw minute hand
		double dUzunluk = saatYaricap * 0.65;
		double dakikaX = merkezX + dUzunluk  * Math.sin(dakika * (2 * Math.PI / 60));
		double minuteY = merkezY - dUzunluk  * Math.cos(dakika * (2 * Math.PI / 60));
		Line dakikaLine = new Line(merkezX, merkezY, dakikaX, minuteY);
		dakikaLine.setStroke(Color.PINK);

		// Draw hour hand 
		double saatUzunluk = saatYaricap * 0.5;
		double saatX = merkezX + saatUzunluk * Math.sin((saat % 12 + dakika / 60.0) * (2 * Math.PI / 12));
		double hourY = merkezY - saatUzunluk * Math.cos((saat % 12 + dakika / 60.0) * (2 * Math.PI / 12));
		Line saatLine = new Line(merkezX, merkezY, saatX, hourY);
		saatLine.setStroke(Color.BLUE);

		getChildren().clear();
		getChildren().addAll(daire, Yazi1, Yazi2, Yazi3, Yazi4, saniyeLine, dakikaLine, saatLine);
	}
}