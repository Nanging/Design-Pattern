package construction;
import buy.ResList;
import thing.*;
import worker.Seller;


public class Factory implements BuildingAction {
	private Seller seller = new Seller();
	public Factory() {
		GoodsCache.loadCache();
	}
	
	public void build() {
		System.out.println("The factory have been built!");
		
	}
	
	public void repair() {
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
	
}
