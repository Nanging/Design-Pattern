package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
import thing.LivestockState;


public abstract class Ox extends Livestock {
	public Ox(int id,species s,float price)
	{
		super(id,s,price);
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.BEEF,9));
		newCarrier.carryToWareHouse();
		
	}
	public boolean slaughter()
	{
		if(nowstate.getState() == 1 )
		{
			System.out.println("�������");
			//�������
			getProduct();
			nowstate.died();
			return true;
		}
		else {
			System.out.println("����������");
			return false;
		}
	}
	
}