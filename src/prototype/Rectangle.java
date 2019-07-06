package prototype;
//继承了克隆功能的具体类
public class Rectangle extends shape{
public Rectangle() {
	type="Rectangle";
}
public void draw() {
	System.out.println("Inside Rectangle::draw() method.");
}

}
