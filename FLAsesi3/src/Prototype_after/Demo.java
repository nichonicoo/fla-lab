package Prototype_after;

public class Demo {
	
	public Demo() {
		Circle cir1 = new Circle(1, "Circle");
		Circle cir2 = (Circle) cir1.Clone();
		
		System.out.println(cir1.getType() + " " + cir1.getId() + cir1);
		System.out.println(cir2.getId() + " " + cir2.getType() + cir2);
		
		cir1.createShape();
		cir2.createShape();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
	}

}
