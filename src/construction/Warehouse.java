package construction;
import thing.Product;

public class Warehouse implements BuildingAction {
	
	private int [] catalog=new int [4];
	
	public void build() {
		System.out.println("The warehouse have been built!");
		for(int i=0;i<catalog.length;i++) {
			catalog[i]=0;
		}
	}
	
	public void repair() {
		System.out.println("The warehouse is being repaired!");
	}
	
	public void destory() {
		System.out.println("The warehouse have been destoryed!");
	}
	
	public void store(Product product) {
		this.catalog[product.getType()]=this.catalog[product.getType()]+product.getNumber();
	}
	
	public void showAmount() {
		for(int i=0;i<this.catalog.length;i++) {
			System.out.println(i+" "+this.catalog[i]);
		}
	}
	
	public Product getProduct(int category,int number) {
		if(this.catalog[category]>number) {
			this.catalog[category]=this.catalog[category]-number;
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
