package construction;

import thing.Goods;
import thing.Product;

public abstract class Store {
	public static int VEG = 3;
	public static int MEATS = 8;
	 
	protected int level;
	 
	//责任链中的下一个元素
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
	
	public int storeMessage(Product forsale){
		if(this.level >= forsale.getType()){
		   return sale(forsale);
		} 
		else {
		  return nextStore.storeMessage(forsale);
		}
	}
	
	public int storeMessage(Goods forsale){
		if(this.level >= forsale.getId()){
		   return sale(forsale);
		}
		else{
		   return nextStore.storeMessage(forsale);
		}
	}
	 
	abstract protected int sale(Product forsale);
	abstract protected int sale(Goods forsale);
}
