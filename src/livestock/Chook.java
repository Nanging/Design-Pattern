package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class Chook extends Livestock{
	public Chook (int id)
	{
		super(id,species.chook,species.chook.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.EGG,6));
		newCarrier.carryToWarehouse();
		
	}
	public boolean getEgg() {
		if(nowstate.getState()==1)
		{
			System.out.println("��ü���");
			//��ü���
			
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		else {
			System.out.println("û�м���");
			return false;
		}
	}

}
