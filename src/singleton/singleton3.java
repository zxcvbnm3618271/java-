package singleton;
/**
 * 
 * @author 233admincol
 *@description 双重检测锁实现模式
 *同步内容下方到if内部，提高了执行的效率不必每次获取对象时都进行同步，只有第一次才同步创建了以后就没必要了。
 *缺点:由于编译器优化原因和JVM底层内部模型原因，偶尔会出现问题，不建议使用。
 */
public class singleton3 {
private static singleton3 instance=null;
private singleton3() {
	
}
public static singleton3 getinstance() {
	if (instance==null) {
		singleton3 sc;
		synchronized (singleton3.class) {
			sc=instance;
			if (sc==null) {
				synchronized (singleton3.class) {
					if (sc==null) {
						sc=new singleton3();
					}
				}
				instance=sc;
			}
		}
	}
	return instance;
}
}
