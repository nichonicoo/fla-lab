package after;

public class Demo {

	public Demo() {
		RoundHole rh = new RoundHole(5);
		RoundPeg rp = new RoundPeg(5);
		SquarePeg sp = new SquarePeg(5);
		
		rh.isFit(rp);
		rh.isFit(new SquaretoRoundPegAdapter(sp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
	}

}
