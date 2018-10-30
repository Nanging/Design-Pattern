package plant;

import thing.*;

public class Cabbage extends DisposablePlant{

	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.CABBAGE,1));
		newCarrier.carryToWareHouse();
	}

	
}
