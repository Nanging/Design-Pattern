package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
import thing.LivestockState;

public abstract class Cow extends Livestock {
	public Cow (int id,species s,float price)
	{
		super(id,s,price);
	}
	
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.MILK,9));
		newCarrier.carryToWarehouse();
	}

	public boolean getMilk()
	{
		if(nowstate.getState() == 1 )
		{
			System.out.println("�������");
			//�������
			nowstate.setDrinkTime();
			nowstate.setFeedTime();
			getProduct();
			return true;
		}
		else {
			System.out.println("�����ܼ���");
			return false;
		}
	}
	
}