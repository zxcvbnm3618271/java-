package Builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		//创建订餐管理对象,通过对象build meal,由meal build 其他餐饮
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal= mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("total Cost:"+vegMeal.getCost());
	}
}
