package prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, shape> shapMap=new Hashtable<String,shape>();
	public static shape getShape(String shapeId) {
		shape cachedShape=shapMap.get(shapeId);
		return (shape)cachedShape.clone();
	}
	public static void loadCache() {
		Square square=new Square();
		square.setId("2");
		shapMap.put(square.getId(), square);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setId("3");
		shapMap.put(rectangle.getId(), rectangle);
	}
}
