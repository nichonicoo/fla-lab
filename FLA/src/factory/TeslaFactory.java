package factory;

import model.Car;
import model.TeslaCar;

public class TeslaFactory extends CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new TeslaCar();
	}

}
