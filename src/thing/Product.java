package thing;
import java.util.Hashtable;

public class Product {
	
	private int type;
	private int number;
	private int price;
	private String productName;
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
	
	public Product(ProductType ptype,int num) {
		if(shapeMap==null) {
			initHashtable();
		}
		type=ptype.getID();
		number=1;
	}
	public Product() {
		initHashtable();
	}
	
	public String getName(int catalog) {
		String name=shapeMap.get(catalog);
		return name;
	}
	
	public int getType() {
		return this.type;
	}
	
	public int setType(int type) {
		this.type=type;
		this.productName=getName(type);
		return this.type;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int setNumber(int number) {
		this.number=number;
		return this.number;
	}
	
	public int getPrice() {
		return this.price;
	}
	public int setPrice(int price) {
		this.price=price;
		return this.price;
	}
	
	
	public String getProductName() {
		return this.productName;
	}
	
	
}
