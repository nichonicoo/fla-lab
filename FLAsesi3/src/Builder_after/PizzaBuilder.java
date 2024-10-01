package Builder_after;

public class PizzaBuilder {
	
	private String shape = null;
	private String topping = null;
	private String crust = null; 
	private Boolean extraCheese = false; 
	
	
	public PizzaBuilder(String shape) {
		this.shape = shape;
	}
	
	public PizzaBuilder addTopping(String topping) {
		this.topping = topping;
		return this;
	}
	
	public PizzaBuilder addCrust(String crust) {
		this.crust = crust;
		return this;
	}
	
	public PizzaBuilder addextraCheese() {
		this.extraCheese = true;
		return this;
	}
	
	public Pizza build() {
		return new Pizza(shape, topping, crust, extraCheese);
	}
	
}
