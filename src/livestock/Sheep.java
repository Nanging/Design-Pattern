package livestock;

import livestock.Livestock.species;

public class Sheep extends Livestock {
	public Sheep(int id)
	{
		super(id,species.sheep,species.sheep.getPrice());
	}
	
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.WOOL,7));
		newCarrier.carryToWareHouse();
		
	}
	public boolean getWool() {
		if(nowstate.getState()==1)
		{
			System.out.println("Wool cutting success");
			//Wool cutting success
			getProduct();
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		else {
			System.out.println("Wool is can not cut now.");
			return false;
		}
	}
}
