package Builder_after;

public class Demo {
	
	public Demo() {
		Pizza defaultPizza = new PizzaBuilder("Round").build();
		Pizza mushroomP = new PizzaBuilder("Square")
				.addTopping("Mushroom").addCrust("Sausage")
				.addextraCheese().build();
		
		System.out.println(defaultPizza.getShape() + defaultPizza.getTopping());
		System.out.println(mushroomP.getShape() + mushroomP.getCrust() + mushroomP.getTopping() + mushroomP.isExtraCheese());
	}

	public static void main(String[] args) {
		
		new Demo();
	}

}
