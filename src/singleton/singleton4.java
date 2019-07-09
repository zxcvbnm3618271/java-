package singleton;
/**
 * 
 * @author 233admincol
 *@description 静态内部类实现模式
 *1.外部类没有static属性，则不会想饿汉式那样立即加载对象。
 *2.只有真正调用getInstance()，才会加载静态内部类，加载类时是线程安全的。instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性
 *3.兼备了并发高效调用和延迟加载的优势。
 */
public class singleton4 {

	private singleton4() {
		
	}
	private static class SingletonClassInstance{
		private static final singleton4 instance=new singleton4();
	}
	public static singleton4 getinstance() {
		return SingletonClassInstance.instance;
	}
}
