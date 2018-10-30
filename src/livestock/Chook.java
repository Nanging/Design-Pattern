package livestock;

import livestock.Livestock.species;
import thing.Carrier;
import thing.Product;
import thing.ProductType;
//继承Livestock类
public class Chook extends Livestock{
	//构造函数
	public Chook (int id)
	{
		super(id,species.chook,species.chook.getPrice());
	}
	public void getProduct() {
		// TODO Auto-generated method stub
		Carrier newCarrier=new Carrier(new Product(ProductType.EGG,6));
		newCarrier.carryToWareHouse();
		
	}
	//收鸡蛋
	public boolean getEgg() {
		//鸡已下蛋
		if(nowstate.getState()==1)
		{
			System.out.println("获得鸡蛋");
			//获得鸡蛋
			
			//重置鸡的状态
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		//鸡未下蛋
		else {
			System.out.println("没有鸡蛋");
			return false;
		}
	}

}
