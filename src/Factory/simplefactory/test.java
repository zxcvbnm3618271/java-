package Factory.simplefactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �򵥹���ģʽ
        // ��ʽһ�����÷��㣬����Ҫ�е��÷�ѡ������Ǹ�ʵ����ֻ��Ҫ�������
        CarFactory.createCar("�µ�").run();
        CarFactory.createCar("���ǵ�").run();
        //c3.run();
 
        // ��ʽ����
        CarFactory.createAudi().run();
        CarFactory.createByd().run();
    }

}
