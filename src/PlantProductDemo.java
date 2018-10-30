import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class PlantProductDemo {						//mediate pattern
	public static void main(String[] args) {
		Carrier newCarrier=new Carrier(new Product(ProductType.CABBAGE,1));
		newCarrier.carryToWareHouse();				//carrier is a mediate works between a harvest operation
													//and the store operation of a certain product of warehouse
													//Here ONLY to show the inside pattern
													//User or Client directly using the carrier is !DISCOURAGED!
	}
}
