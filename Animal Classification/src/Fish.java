
public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		
		super(0);
	}
	
	public Fish(String name) {
		super(0);
		this.name=name;
		
	}
	
	//override
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	@Override
	public void play() {
		System.out.println(name + " Oyunda\n");
		
	}
	
	@Override
	public void Walk() {
		
		System.out.println("Ayak Sayýsý " + legs + " Yüzüyor");
	}
	
	@Override
	public void eat() {
		System.out.println("BALIK " + name + " YEMEK YÝYOR GGRGRGRGR");
		
		
	}
	
}
