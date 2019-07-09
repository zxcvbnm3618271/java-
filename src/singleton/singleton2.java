package singleton;

import sun.security.jca.GetInstance.Instance;
/**
 * 
 * @author 233admincol
 *@description 懒汉单例模式
 *不先对静态类对象instance初始化
 *缺点:资源利用高了。但是，每次调用getInstance()方法都需要同步，并发效率较低。
 */
public class singleton2 {
	private static singleton2 instance;
	
	private singleton2() {
		
	}
	public static synchronized singleton2 getinstance() {
		if (instance==null) {
			instance=new singleton2();
		}
		return instance;
	}
	
}
