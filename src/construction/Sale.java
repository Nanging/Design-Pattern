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
	
	public static void sale(Product product) {
		Store storeChain = getChainOfStores();
		storeChain.storeMessage(product);
	}
	
	public static void sale(Goods product) {
		Store storeChain = getChainOfStores();
		storeChain.storeMessage(product);
	}
		 
}
