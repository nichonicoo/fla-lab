package after;

// ini class tambahan untuk adapter

public class SquaretoRoundPegAdapter extends RoundPeg{
	
	SquarePeg sp;

	public SquaretoRoundPegAdapter(SquarePeg sp) {
		
		// ini buat convert si sisi ke diameter, karena paretnya si diameter int harus di typecast
		// karna 
		
		super((int)(sp.getSide()  * Math.sqrt(2)));
		this.sp = sp;
	}
	
	
}
