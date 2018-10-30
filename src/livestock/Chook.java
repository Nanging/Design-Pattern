package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class Chook extends Livestock{
	//Constructor
	public Chook (int id)
	{
		super(id,species.chook,species.chook.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.EGG,6));
		newCarrier.carryToWareHouse();
		
	}
	//Egg collection
	public boolean getEgg() {
		//Chickens have laid eggs
		if(nowstate.getState()==1)
		{
			System.out.println("获得鸡蛋");
			//Get eggs
			getProduct();
			//Reset chicken status
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		//The chicken does not lay eggs
		else {
			System.out.println("没有鸡蛋");
			return false;
		}
	}

}
