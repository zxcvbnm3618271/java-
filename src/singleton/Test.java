package singleton;

public class Test {
//���Ե���ģʽ
	public static void main(String[] args) {
		// ���ܴ������ٴζ��󣬶���ָ��ͬһ������
        singleton1 s1 = singleton1.getInstance();
        singleton1 s11 = singleton1.getInstance();
        System.out.println("����ʽ�Ƿ���ͬһ������: " + (s1 == s11));
 
        singleton2 s2 = singleton2.getinstance();
        singleton2 s22 = singleton2.getinstance();
        System.out.println("����ʽ�Ƿ���ͬһ������: " + (s2 == s22));
 
        singleton3 s3 = singleton3.getinstance();
        singleton3 s33 = singleton3.getinstance();
        System.out.println("˫�ؼ����ʽ�Ƿ���ͬһ������: " + (s3 == s33));
 
        singleton4 s4 = singleton4.getinstance();
        singleton4 s44 = singleton4.getinstance();
        System.out.println("��̬�ڲ���ʽ�Ƿ���ͬһ������: " + (s4 == s44));
 
        singleton5 s5 = singleton5.INSTANCE;
        singleton5 s55 = singleton5.INSTANCE;
        System.out.println("ö��ʽ�Ƿ���ͬһ������: " + (s5 == s55));

		
	}

}
