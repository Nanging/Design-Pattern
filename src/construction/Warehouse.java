package construction;
import java.util.Hashtable;

import buy.ResList;
import thing.Product;

public class Warehouse implements BuildingAction {
	
	private int [] catalog=new int [9];
	private int [] priceList= {1,2,3,5,15,13,2,7,4};
	private static Hashtable<Integer,String > shapeMap;
	
	private static void initHashtable() {
		shapeMap=new Hashtable<Integer, String>();
		shapeMap.put(0,"CABBAGE");
		shapeMap.put(1,"CARROT");
		shapeMap.put(2,"APPLE");
		shapeMap.put(3,"PEAR");
		shapeMap.put(4,"BEEF");
		shapeMap.put(5,"PORK");
		shapeMap.put(6,"EGG");
		shapeMap.put(7,"WOOL");
		shapeMap.put(8,"MILK");
	}
	
	public Warehouse() {
		initHashtable();
	}
	
	public Warehouse(int [] arg) {
		catalog = arg;
	}
	
	public void build() {
		ResList resList=ResList.Instance();
		if(resList.money<200) {
			System.out.println("Your money is not enough");
			return;
		}
		else {
			resList.money=resList.money-200;
		}
		System.out.println("The warehouse have been built!");
		for(int i=0;i<catalog.length;i++) {
			catalog[i]=0;
		}
	}
	
	public void repair() {
		ResList resList=ResList.Instance();
		if(resList.money<20) {
			System.out.println("Your money is not enough");
			return;
		}
		else {
			resList.money=resList.money-20;
		}
		System.out.println("The warehouse is being repaired!");
	}
	
	public void destory() {
		System.out.println("The warehouse have been destoryed!");
	}
	
	public String getName(int catalog) {
		String name=shapeMap.get(catalog);
		return name;
	}
	
	public void store(Product product) {
		this.catalog[product.getType()]=this.catalog[product.getType()]+product.getNumber();
	}
	
	public void showAmount() {
		for(int i=0;i<this.catalog.length;i++) {
			System.out.println(getName(i)+" "+this.catalog[i]);
		}
	}
	
	public Product getProduct(int category,int number) {
		if(this.catalog[category]>=number) {
			this.catalog[category]=this.catalog[category]-number;
			Product product=new Product();
			product.setType(category);
			product.setNumber(number);
			product.setPrice(priceList[category]);
			return product;
		}
		else {
			System.out.println("The warehouse has no "+getName(category));
			Product product=new Product();
			return product;
		}
	}

	
}
