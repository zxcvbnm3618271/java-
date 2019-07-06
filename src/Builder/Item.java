package Builder;
//食品类接口,包含了包装类
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
