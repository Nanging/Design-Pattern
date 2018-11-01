package construction;
import buy.ResList;
import thing.*;
import worker.Seller;


public class Factory implements BuildingAction {

	private Seller seller;

	public Factory() {
		GoodsCache.loadCache();
		seller = new Seller();
	}
	
	public void build() {
		ResList resList=ResList.Instance();
		if(resList.money<250) {
			System.out.println("Your money is not enough");
			return;
		}
		else {
			resList.money=resList.money-250;
		}
		System.out.println("The factory have been built!");
		
	}
	
	public void repair() {
		ResList resList=ResList.Instance();
		if(resList.money<25) {
			System.out.println("Your money is not enough");
			return;
		}
		else {
			resList.money=resList.money-25;
		}
		System.out.println("The factory is being repaired!");
	}
	
	public void destory() {
		System.out.println("The factory have been destoryed!");
	}
	
	public Goods deal(Product product) {
		Goods clonedGoods=(Goods)GoodsCache.getShape(product.getType());
		clonedGoods.setNumber(product.getNumber());
		clonedGoods.setPrice(product.getPrice()*2);
		return clonedGoods;
	}
	public void dealAndSell(Product product) {
		Goods clonedGoods=(Goods)GoodsCache.getShape(product.getType());
		clonedGoods.setNumber(product.getNumber());
		clonedGoods.setPrice(product.getPrice()*2);
		seller.sell(clonedGoods);
	}
	public void dealAndSell() {
		System.out.println("can't sell it");
	}
	
}
