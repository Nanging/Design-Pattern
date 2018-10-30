package thing;
import java.util.Hashtable;

public class Product {
	
	private int type;
	private int number;
	private int price;
	private String productName;
	private static Hashtable<Integer,String > shapeMap = new Hashtable<Integer, String>();
	
	public Product() {
		shapeMap.put(1,"Egg");
		shapeMap.put(2,"Chicken");
		shapeMap.put(3,"Milk");
		shapeMap.put(4,"Corn");
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
