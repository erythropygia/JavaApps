
public abstract class Animal {
	
	protected int legs;
	
	protected Animal(int legs) {
		
		this.legs=legs;
		
	}
	
	public abstract void eat();
		
		
	
	public void Walk() {
		System.out.printf("Ayak Sayýsý: %d\n",legs);
		
	}
	
	

}
