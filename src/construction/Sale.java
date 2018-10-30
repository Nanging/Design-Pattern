package construction;

import thing.Goods;
import thing.Product;

public class Sale {
	private static Store getChainOfStores(){
		   
		Store vegStore = new VegStore(Store.VEG);
		Store meatStore = new MeatStore(Store.MEATS);
		     
		vegStore.setNextStore(meatStore);
		 
		return vegStore;  
	}
	
	public static int sale(Product product) {
		Store storeChain = getChainOfStores();
		return storeChain.storeMessage(product);
	}
	
	public static int sale(Goods product) {
		Store storeChain = getChainOfStores();
		return storeChain.storeMessage(product);
	}
		 
}
