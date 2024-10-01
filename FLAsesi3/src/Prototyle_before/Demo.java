package Prototyle_before;

public class Demo {
	
	public Demo() {
		Rectangle rec1 = new Rectangle(1, "Rectangle");
		
		Rectangle rec2;
		
		rec2 = new Rectangle(1,  "Rectangle");	
		//rec2 = rec1; // ini salah, dia refer ke si rec1 lg dia g bikin obj baru 
		
		System.out.println(rec1);
		System.out.println(rec2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
	}

}
