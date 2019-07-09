package singleton;
/**
 * 
 * @author 233admincol
 *@description 枚举单例模式
 *实现简单，枚举本身就是单例模式。由JVM从根本上提供保障，避免通过反射和反序列化的漏洞
 *缺点:无延迟加载
 */
public enum singleton5 {
INSTANCE;
	public void singletonOperation() {
		
	}
}
