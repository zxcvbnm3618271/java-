package Factory.abstractfactory;

public class test {
	public static void main(String[] args)
	{
		// 高端工厂
        Engine luxuryEngine = new LuxuryCarFactory().createEngine();
        luxuryEngine.run();
        luxuryEngine.start();
 
        // 低端工厂
        Engine lowEngine = new LowCarFactory().createEngine();
        lowEngine.run();
        lowEngine.start();
	}
	
    

}
