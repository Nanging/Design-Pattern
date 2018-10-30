package thing;
import java.util.Hashtable;

public class Product {
	
	private int type;
	private int number;
	private int price;
	private String productName;
	private static Hashtable<Integer,String > shapeMap = new Hashtable<Integer, String>();
	
	public Product() {
		shapeMap.put(1,"CABBAGE");
		shapeMap.put(2,"CARROT");
		shapeMap.put(3,"APPLE");
		shapeMap.put(4,"PEAR");
		shapeMap.put(5,"BEEF");
		shapeMap.put(6,"PORK");
		shapeMap.put(7,"EGG");
		shapeMap.put(8,"WOOL");
		shapeMap.put(9,"MILK");
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
