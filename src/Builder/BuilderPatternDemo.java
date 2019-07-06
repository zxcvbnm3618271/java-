package Builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		//�������͹������,ͨ������build meal,��meal build ��������
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal= mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("total Cost:"+vegMeal.getCost());
	}
}
