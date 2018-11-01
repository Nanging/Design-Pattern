package plant;

import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class AppleTree extends RepeatablePlant {
	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.APPLE,1));
		newCarrier.carryToWareHouse();
	}

	@Override
	public void showType() {
		// TODO Auto-generated method stub
		System.out.print("ƻ��");
	}
}
