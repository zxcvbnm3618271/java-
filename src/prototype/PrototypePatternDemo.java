package prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		shape cloneShape=(shape)ShapeCache.getShape("2");
		System.out.println("shape:"+cloneShape.getType());
	}
}
