package untitled;

public class car {
	private String color;
	private String model;
	private double engine;
	
	
	public car (String color, String model,double engine) {
		this.color=color;
		this.model=model;
		this.engine=engine;
	}
	
	public car() {
		this.color="Renk Bilgisi Yok";
		this.model="Model Bilgisi Yok";
		this.engine=0;
	}
	

	public void start() {
		System.out.println("Araba Calisti");	
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	
	public void showInfo() {
		this.start();
		System.out.println("Araba Rengi:" + this.color);
		System.out.println("Araba Modeli:" + this.model);
		System.out.println("Araba Motor Gücü:" + this.engine);
		
		
	}
	
	public void showInfodef() {
		System.out.println("Araba Rengi:" + this.color);
		System.out.println("Araba Modeli:" + this.model);
		System.out.println("Araba Motor Gücü:" + this.engine);
		
	}
	
	
	
	
	
	
	

}
