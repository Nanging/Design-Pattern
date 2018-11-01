package plant;

import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class Carrot extends DisposablePlant {
	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.CARROT,1));
		newCarrier.carryToWareHouse();
	}
	@Override
	public void showType() {
		// TODO Auto-generated method stub
		System.out.print("ÂÜ²·");
	}
}
