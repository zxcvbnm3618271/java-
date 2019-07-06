package Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
private List<Item> items=new ArrayList<Item>();
//添加食品,通过该方法build对象
public void addItem(Item item) {
	items.add(item);
}
//计算总金额
public float getCost() {
	float cost=0.0f;
	for(Item item:items) {
		cost+=item.price();
	}
	return cost;
}
//显示食品所有名称
public void showItems() {
	for (Item item : items) {
		System.out.println("Item:"+item.name());
		System.out.println(",Packing:"+item.packing().pack());
		System.out.println(",Price:"+item.price());
	}
	
	
}
}
