package Factory;

import model.Pants;
import model.PumaPants;
import model.PumaShirt;
import model.Shirt;

public class PumaFactory implements AbstractFactory{

	public PumaFactory() {
		
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
