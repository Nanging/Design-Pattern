package construction;
import thing.Product;

public class BuildingTest {
	
	
	public static void main(String[] args) {
		
		BuildingFactory test=new BuildingFactory();
		Factory aaa=(Factory)test.produce("factory");
		Product a=new Product();
		a.setType(2);
		a.setNumber(4);
		aaa.deal(a);
	}

}
