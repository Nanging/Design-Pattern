package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
import thing.LivestockState;

public abstract class Cow extends Livestock {
	public Cow (int id)
	{
		super(id,species.cow,species.cow.getPrice());
	}
	
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.MILK,9));
		newCarrier.carryToWareHouse();
	}

	public boolean getMilk()
	{
		if(nowstate.getState() == 1 )
		{
			System.out.println("挤奶完成");
			//挤奶完成
			nowstate.setDrinkTime();
			nowstate.setFeedTime();
			getProduct();
			return true;
		}
		else {
			System.out.println("还不能挤奶");
			return false;
		}
	}
	
}
