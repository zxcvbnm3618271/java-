package singleton;
/**
 * 
 * @author 233admincol
 *@description ��������ģʽ
 *�ڴ��������ʱ�ͳ�ʼ����̬�����instance
 *ȱ��:���ֻ�Ǽ��ر��࣬�����ǵ���getInstance()��������Զû�е��ã���������Դ�˷ѡ�
 */
public class singleton1 {
	private static singleton1 instance=new singleton1();
	public singleton1() {
		
	}
	public static singleton1 getInstance() {
		return instance;
	}
}
