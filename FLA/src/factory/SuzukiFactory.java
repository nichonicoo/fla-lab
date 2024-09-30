package factory;

import model.Car;
import model.SuzukiCar;

public class SuzukiFactory extends CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new SuzukiCar();
	}

}
