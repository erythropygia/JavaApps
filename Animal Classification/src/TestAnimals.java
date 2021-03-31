
public class TestAnimals {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		Pet p1=d;
		p1.play();
		
		
		// CAT
		Cat c2 = new Cat();
		c2.setName("Papel");
		System.out.printf("Ýsim: %s\n" , c.getName());
		c.setName("Selim");
		c.eat();
		c.play();
		
		p1=c2;
		p1.play();
		
		
		
		// Spider
		System.out.printf("\n");
		e.Walk();
		e.eat();
		
		p=d;
		p.play();
		
		
		
		//Fish
		System.out.printf("\n");
		Fish a1 = new Fish("Lulu");
		a.Walk();
		a.eat();
		System.out.printf("Balýk Adý: %s \n",a1.getName());
		a1.setName("Muharrem Balýk");
		a1.play();
		

	}

}
