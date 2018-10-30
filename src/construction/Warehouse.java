package construction;
import fruit.Product;

public class Warehouse implements BuildingAction {
	
	private int [] catelog=new int [4];
	
	public void build() {
		System.out.println("The warehouse have been built!");
		for(int i=0;i<catelog.length;i++) {
			catelog[i]=0;
		}
	}
	
	public void repair() {
		System.out.println("The warehouse is being repaired!");
	}
	
	public void destory() {
		System.out.println("The warehouse have been destoryed!");
	}
	
	public void store(Product product) {
		this.catelog[product.getType()]=this.catelog[product.getType()]+product.getNumber();
	}
	
	public void showAmount() {
		for(int i=0;i<this.catelog.length;i++) {
			System.out.println(i+" "+this.catelog[i]);
		}
	}
	
	public Product getProduct(int category,int number) {
		if(this.catelog[category]>number) {
			this.catelog[category]=this.catelog[category]-number;
			Product product=new Product();
			product.setType(category);
			product.setNumber(number);
			return product;
		}
		else {
			System.out.println("The warehouse has no "+category);
			return null;
		}
	}

	
}
