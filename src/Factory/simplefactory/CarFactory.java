package Factory.simplefactory;

public class CarFactory {
	// ��ʽһ��
    public static Car createCar(String type) {
        if("�µ�".equals(type)){
            return new Audi();
        } else if("���ǵ�".equals(type)){
            return new Byd();
        } else {
            return null;
        }
    }
 
    // ��ʽ����
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }
}
