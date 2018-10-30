package construction;

import thing.Goods;
import thing.Product;

public class MeatStore extends Store{
	public MeatStore(int level){
	    this.level = level;
	} 
	
	protected int sale(Product forsale) {    
		System.out.println("商店2销售总价： " + forsale.getPrice()*forsale.getNumber());
		return forsale.getPrice()*forsale.getNumber();
	}
	protected int sale(Goods forsale) {    
		   System.out.println("商店2销售总价： " + forsale.getPrice()*forsale.getNumber());
		   return forsale.getPrice()*forsale.getNumber();
	}
}
