package prototype;

import java.io.Serializable;

//����ͼ����Ļ���
//ʵ��Cloneable�ӿ�ʹ�ÿ�¡����
public abstract class shape implements Cloneable,Serializable{
	private String id;
	protected String type;
	abstract void draw();
	public String getType() {
		return this.type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public Object clone() {
		Object clone=null;
		try {
			clone=super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clone;
	}
}
