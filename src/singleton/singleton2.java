package singleton;

import sun.security.jca.GetInstance.Instance;
/**
 * 
 * @author 233admincol
 *@description ��������ģʽ
 *���ȶԾ�̬�����instance��ʼ��
 *ȱ��:��Դ���ø��ˡ����ǣ�ÿ�ε���getInstance()��������Ҫͬ��������Ч�ʽϵ͡�
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
