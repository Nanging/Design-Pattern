package construction;

import thing.Goods;
import thing.Product;

public class VegStore extends Store{
	public VegStore(int level){
	    this.level = level;
	}
	
	protected int sale(Product forsale) {    
	   System.out.println("sale1 " + forsale.getPrice());
	   return forsale.getPrice()*forsale.getNumber();
	}
	
	protected int sale(Goods forsale) {    
		   System.out.println("sale1 " + forsale.getPrice());
		   return forsale.getPrice()*forsale.getNumber();
	}
}
