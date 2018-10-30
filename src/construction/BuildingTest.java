package construction;
import thing.Product;

public class BuildingTest {
	
	
	public static void main(String[] args) {
		
		BuildingFactory test=new BuildingFactory();
		Warehouse aaa=(Warehouse)test.produce("warehouse");
		aaa.store(new Product());
		aaa.showAmount();
		aaa.store(new Product());
		aaa.showAmount();
		aaa.getProduct(1,1);
		aaa.showAmount();
		aaa.getProduct(0,1);
		aaa.showAmount();
	}

}
