package singleton;
/**
 * 
 * @author 233admincol
 *@description ˫�ؼ����ʵ��ģʽ
 *ͬ�������·���if�ڲ��������ִ�е�Ч�ʲ���ÿ�λ�ȡ����ʱ������ͬ����ֻ�е�һ�β�ͬ���������Ժ��û��Ҫ�ˡ�
 *ȱ��:���ڱ������Ż�ԭ���JVM�ײ��ڲ�ģ��ԭ��ż����������⣬������ʹ�á�
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
