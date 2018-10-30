package construction;
import thing.*;


public class Factory implements BuildingAction {
	
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
//		System.out.println(clonedGoods.getGoodsType());
//		System.out.println(clonedGoods.getNumber());
	}
	
}
