package Factory;

import model.Pants;
import model.PumaPants;
import model.PumaShirt;
import model.Shirt;

public class NikeFactory implements AbstractFactory{

	public NikeFactory() {
		
	}

	@Override
	public Shirt createShirt() {
		
		return new PumaShirt();
	}

	@Override
	public Pants createPants() {
		
		return new PumaPants();
	}

}
