package Builder_before;

public class Pizza {
	
	private String shape;
	private String topping;
	private String crust;
	private boolean extraCheese;
	
	
	public Pizza(String shape, String topping, String crust, boolean extraCheese) {
		super();
		this.shape = shape;
		this.topping = topping;
		this.crust = crust;
		this.extraCheese = extraCheese;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public String getTopping() {
		return topping;
	}


	public void setTopping(String topping) {
		this.topping = topping;
	}


	public String getCrust() {
		return crust;
	}


	public void setCrust(String crust) {
		this.crust = crust;
	}


	public boolean isExtraCheese() {
		return extraCheese;
	}


	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}
	
	

}
