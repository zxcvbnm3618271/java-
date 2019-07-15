package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

public class ShapeCache {
		//�������ԭ��
	private static Hashtable<String, shape> shapMap=new Hashtable<String,shape>();
	//����ԭ�����ǳ��¡����
	public static shape getShape(String shapeId) {
		shape cachedShape=shapMap.get(shapeId);
		return (shape)cachedShape.clone();
	}
	
	//����ԭ��������¡����
	public static shape getShape2(String shapeId) throws IOException, ClassNotFoundException
	{
		shape cachedShape=shapMap.get(shapeId);
		//�����ֽ������
		ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		//�������������
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
		//��ԭ�Ͷ���д������������,��Ϊ�������������������ֽ������,���ɵ����ᱣ�����ֽ��������
		objectOutputStream.writeObject(cachedShape);
		//תΪ��������
		byte[] bytes=byteArrayOutputStream.toByteArray();
		ByteArrayInputStream bInputStream=new ByteArrayInputStream(bytes);
		//����������ת����
		ObjectInputStream oInputStream=new ObjectInputStream(bInputStream);
		shape cachedShape2=(shape)oInputStream.readObject();
		
		return cachedShape2;
	}
	//��������ԭ�������Hashtable��
	public static void loadCache() {
		Square square=new Square();
		square.setId("2");
		shapMap.put(square.getId(), square);
		Rectangle rectangle=new Rectangle();
		rectangle.setId("3");
		shapMap.put(rectangle.getId(), rectangle);
	}
}
