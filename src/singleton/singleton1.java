package singleton;
/**
 * 
 * @author 233admincol
 *@description 饿汉单例模式
 *在创建这个类时就初始化静态类对象instance
 *缺点:如果只是加载本类，而不是调用getInstance()，甚至永远没有调用，则会造成资源浪费。
 */
public class singleton1 {
	private static singleton1 instance=new singleton1();
	public singleton1() {
		
	}
	public static singleton1 getInstance() {
		return instance;
	}
}
