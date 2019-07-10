package Factory.simplefactory;

public class CarFactory {
	// 方式一：
    public static Car createCar(String type) {
        if("奥迪".equals(type)){
            return new Audi();
        } else if("比亚迪".equals(type)){
            return new Byd();
        } else {
            return null;
        }
    }
 
    // 方式二：
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }
}
