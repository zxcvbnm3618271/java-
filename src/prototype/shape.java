package prototype;

import java.io.Serializable;

//所有图像类的基类
//实现Cloneable接口使用克隆功能
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
