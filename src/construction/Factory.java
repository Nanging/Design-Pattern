package construction;
import fruit.Product;

public class Factory implements BuildingAction {
	
	
	public void build() {
		System.out.println("The factory have been built!");
		
	}
	
	public void repair() {
		System.out.println("The factory is being repaired!");
	}
	
	public void destory() {
		System.out.println("The factory have been destoryed!");
	}
	
	public void deal(Product product) {
		product.getPrice();    //��ȡ��ǰ��Ʒ������ļ۸�
	}
}
