package Factory.factorymethod;

import Factory.simplefactory.Byd;
import Factory.simplefactory.Car;

public class BydFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}

}
