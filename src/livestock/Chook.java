package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class Chook extends Livestock{
	public Chook (int id,species s,float price)
	{
		super(id,s,price);
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.EGG,6));
		newCarrier.carryToWareHouse();
		
	}
	public boolean getEgg() {
		if(nowstate.getState()==1)
		{
			System.out.println("获得鸡蛋");
			//获得鸡蛋
			
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		else {
			System.out.println("没有鸡蛋");
			return false;
		}
	}

}
