package factory;

import model.Car;
import model.Hondacar;

public class HondaFactory extends CarFactory {

	@Override
	public Car createCar() {
		
		return new Hondacar();
	}

}
