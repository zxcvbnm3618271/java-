package Factory.simplefactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 简单工厂模式
        // 方式一：调用方便，不需要有调用方选择调用那个实例，只需要传入参数
        CarFactory.createCar("奥迪").run();
        CarFactory.createCar("比亚迪").run();
        //c3.run();
 
        // 方式二：
        CarFactory.createAudi().run();
        CarFactory.createByd().run();
    }

}
