package Factory.abstractfactory;

public class test {
	public static void main(String[] args)
	{
		// �߶˹���
        Engine luxuryEngine = new LuxuryCarFactory().createEngine();
        luxuryEngine.run();
        luxuryEngine.start();
 
        // �Ͷ˹���
        Engine lowEngine = new LowCarFactory().createEngine();
        lowEngine.run();
        lowEngine.start();
	}
	
    

}
