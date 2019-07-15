package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

public class ShapeCache {
		//保存类的原型
	private static Hashtable<String, shape> shapMap=new Hashtable<String,shape>();
	//产生原型类的浅克隆对象
	public static shape getShape(String shapeId) {
		shape cachedShape=shapMap.get(shapeId);
		return (shape)cachedShape.clone();
	}
	
	//产生原型类的深克隆对象
	public static shape getShape2(String shapeId) throws IOException, ClassNotFoundException
	{
		shape cachedShape=shapMap.get(shapeId);
		//创建字节输出流
		ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		//创建对象输出流
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
		//将原型对象写入对象输出流中,因为对象输出流定向输出到字节输出流,生成的流会保存在字节输出流中
		objectOutputStream.writeObject(cachedShape);
		//转为二进制流
		byte[] bytes=byteArrayOutputStream.toByteArray();
		ByteArrayInputStream bInputStream=new ByteArrayInputStream(bytes);
		//将二进制流转对象
		ObjectInputStream oInputStream=new ObjectInputStream(bInputStream);
		shape cachedShape2=(shape)oInputStream.readObject();
		
		return cachedShape2;
	}
	//加载所有原型类存入Hashtable中
	public static void loadCache() {
		Square square=new Square();
		square.setId("2");
		shapMap.put(square.getId(), square);
		Rectangle rectangle=new Rectangle();
		rectangle.setId("3");
		shapMap.put(rectangle.getId(), rectangle);
	}
}
