package Prototype_after;

public class Rectangle extends Shape{
	
	public Rectangle(Integer id, String type) {
		super(id, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createShape() {
		System.out.println("creating a rectangle..");		
	}
}
