package Factory.factorymethod;

import Factory.simplefactory.Audi;
import Factory.simplefactory.Car;

public class AudiFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
