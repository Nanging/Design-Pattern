import construction.*;
import thing.Goods;
import thing.Product;

public class Demo {
	public static void main(String[] args) {
		Farm farm = Farm.getInstance();
		
		Warehouse ware=farm.getWarehouse();
		Factory factory=farm.getFactory();
		
		System.out.println("Show the list:");
		ware.showAmount();
		
		Product a=new Product();                       //Get a product
		a.setType(2);
		a.setNumber(4);
		a.setPrice(5);
		ware.store(a);
		
		System.out.println("\nShow the list:");
		ware.showAmount();
		
		Product aa = ware.getProduct(2, 2);
		factory.dealAndSell(aa);                           //Deal the product
		
		System.out.println("\nShow the list:");
		ware.showAmount();
	}
}
