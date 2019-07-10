package Factory.factorymethod;

import Factory.simplefactory.Car;

public class test {
	public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }

}
