package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;

public class Pig extends Livestock {
	public pig(int id)
	{
		super(id,species.pig,species.pig.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.PORK,5));
		newCarrier.carryToWarehouse();
		
	}
	public boolean slaughter()
	{
		if(nowstate.getState()==1)
		{
			System.out.println("�������");
			//��ò�Ʒ������
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