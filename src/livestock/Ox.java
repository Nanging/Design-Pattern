package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
import thing.LivestockState;


public abstract class Ox extends Livestock {
	public ox(int id)
	{
		super(id,species.ox,species.ox.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.BEEF,9));
		newCarrier.carryToWarehouse();
		
	}
	public boolean slaughter()
	{
		if(nowstate.getState() == 1 )
		{
			System.out.println("屠宰完成");
			//屠宰完成
			getProduct();
			nowstate.died();
			return true;
		}
		else {
			System.out.println("还不能屠宰");
			return false;
		}
	}
	
}