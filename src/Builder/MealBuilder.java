package Builder;

public class MealBuilder {
//创建一个管理餐对象,并加入一份素菜汉堡
	public Meal prepareVegMeal() {
	Meal meal=new Meal();
	meal.addItem(new VegBurger());
	meal.addItem(new Coke());
	return meal;
}
	//创建一个管理餐对象,并加入鸡肉汉堡
	public Meal prepareNonVegMeal() {
	Meal meal=new Meal();
	meal.addItem(new chickenBurger());
	meal.addItem(new Pepsi());
	return meal;
	
	}
	}
