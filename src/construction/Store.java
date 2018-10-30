package construction;

import buy.ResList;
import thing.Goods;
import thing.Product;

public abstract class Store {
	public static int VEG = 3;
	public static int MEATS = 8;
	 
	protected int level;
	 
	//璐ｄ换閾句腑鐨勪笅涓�涓厓绱�
	protected Store nextStore;
	 
	public void setNextStore(Store nextStore){
	   this.nextStore = nextStore;
	}
	 
//	public void storeMessage(int level, String message){
//	   if(this.level <= level){
//	      sale(message);
//	   }
//	   if(nextStore !=null){
//	      nextStore.storeMessage(level, message);
//	   }
//	}
	
	public void storeMessage(Product forsale){
		if(this.level >= forsale.getType()){
			ResList.Instance().money += sale(forsale);
		} 
		else {
			nextStore.storeMessage(forsale);
		}
	}
	
	public void storeMessage(Goods forsale){
		if(this.level >= forsale.getId()){
			ResList.Instance().money += sale(forsale);
		} 
		else {
			nextStore.storeMessage(forsale);
		}
	}
	 
	abstract protected int sale(Product forsale);
	abstract protected int sale(Goods forsale);
}
