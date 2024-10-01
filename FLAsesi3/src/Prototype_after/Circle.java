package Prototype_after;

public class Circle extends Shape{

	public Circle(Integer id, String type) {
		super(id, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createShape() {
		System.out.println("Creating a circle..");		
	}
	
}
