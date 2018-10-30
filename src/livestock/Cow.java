package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
import thing.LivestockState;

public class Cow extends Livestock {
	public Cow (int id)
	{
		super(id,species.cow,species.cow.getPrice());
	}
	
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.MILK,9));
		newCarrier.carryToWareHouse();
	}
	//Milk
	public boolean getMilk()
	{
		if(nowstate.getState() == 1 )
		{
			System.out.println("Milking Success");
			//Milking Success
			nowstate.setDrinkTime();
			nowstate.setFeedTime();
			getProduct();
			return true;
		}
		else {
			System.out.println("Not milking yet.");
			return false;
		}
	}
	
}
