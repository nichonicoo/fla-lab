package before;

public class Demo {

	public Demo() {
		RoundHole rh = new RoundHole(5);
		RoundPeg rp = new RoundPeg(5);
		SquarePeg sp = new SquarePeg(5);
		
		rh.isFit(rp);
		//rh.isFit(sp); // <- error 
		
		
	}

	public static void main(String[] args) {
		new Demo();

	}

}
