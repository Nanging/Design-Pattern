package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class Pig extends Livestock {
	public Pig(int id)
	{
		super(id,species.pig,species.pig.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.PORK,5));
		newCarrier.carryToWareHouse();
		
	}
	public boolean slaughter()
	{
		if(nowstate.getState()==1)
		{
			System.out.println("屠宰完成");
			//获得产品，猪肉
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