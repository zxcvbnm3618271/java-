package singleton;

public class Test {
//测试单例模式
	public static void main(String[] args) {
		// 不管创建多少次对象，都是指向同一个对象
        singleton1 s1 = singleton1.getInstance();
        singleton1 s11 = singleton1.getInstance();
        System.out.println("饿汉式是否是同一个对象: " + (s1 == s11));
 
        singleton2 s2 = singleton2.getinstance();
        singleton2 s22 = singleton2.getinstance();
        System.out.println("懒汉式是否是同一个对象: " + (s2 == s22));
 
        singleton3 s3 = singleton3.getinstance();
        singleton3 s33 = singleton3.getinstance();
        System.out.println("双重检测锁式是否是同一个对象: " + (s3 == s33));
 
        singleton4 s4 = singleton4.getinstance();
        singleton4 s44 = singleton4.getinstance();
        System.out.println("静态内部类式是否是同一个对象: " + (s4 == s44));
 
        singleton5 s5 = singleton5.INSTANCE;
        singleton5 s55 = singleton5.INSTANCE;
        System.out.println("枚举式是否是同一个对象: " + (s5 == s55));

		
	}

}
