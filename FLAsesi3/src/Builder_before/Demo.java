package Builder_before;

public class Demo {
	
	public Demo(){	
		Pizza p1 = new Pizza("Square", "Mushroom", "Sausage", true);
		Pizza p2 = new Pizza("Round", null, null, false);
	}

	public static void main(String[] args) {
		new Demo();
	}

}
