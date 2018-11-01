package construction;

import buy.ResList;
import thing.Goods;
import thing.Product;

public class MeatStore extends Store{
	public MeatStore(int level){
	    this.level = level;
	} 
	
	protected void sale() {
		
	}
	
	protected int sale(Product forsale) {    
		System.out.println("MeatStore: $" + forsale.getPrice()*forsale.getNumber());
		ResList resList = ResList.Instance();
		resList.money += forsale.getPrice()*forsale.getNumber();
		return forsale.getPrice()*forsale.getNumber();
	}
	protected int sale(Goods forsale) {    
		System.out.println("MeatStore: $" + forsale.getPrice()*forsale.getNumber());
		ResList resList = ResList.Instance();
		resList.money += forsale.getPrice()*forsale.getNumber();
		return forsale.getPrice()*forsale.getNumber();
	}
}
