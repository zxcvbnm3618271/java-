package singleton;
/**
 * 
 * @author 233admincol
 *@description ��̬�ڲ���ʵ��ģʽ
 *1.�ⲿ��û��static���ԣ��򲻻������ʽ�����������ض���
 *2.ֻ����������getInstance()���Ż���ؾ�̬�ڲ��࣬������ʱ���̰߳�ȫ�ġ�instance��static final���ͣ���֤���ڴ���ֻ������һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ���֤���̰߳�ȫ��
 *3.�汸�˲�����Ч���ú��ӳټ��ص����ơ�
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
