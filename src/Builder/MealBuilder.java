package Builder;

public class MealBuilder {
//����һ������Ͷ���,������һ���ز˺���
	public Meal prepareVegMeal() {
	Meal meal=new Meal();
	meal.addItem(new VegBurger());
	meal.addItem(new Coke());
	return meal;
}
	//����һ������Ͷ���,�����뼦�⺺��
	public Meal prepareNonVegMeal() {
	Meal meal=new Meal();
	meal.addItem(new chickenBurger());
	meal.addItem(new Pepsi());
	return meal;
	
	}
	}
