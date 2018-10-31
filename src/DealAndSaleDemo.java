
import construction.BuildingFactory;
import construction.Factory;
import construction.Sale;
import thing.Goods;
import thing.Product;

public class DealAndSaleDemo {
	
	
	public static void main(String[] args) {
		
		BuildingFactory test=new BuildingFactory();    //Build a factory
		Factory aaa=(Factory)test.produce("factory");  
		
		Product a=new Product();                       //Get a product
		a.setType(2);
		a.setNumber(4);
		a.setPrice(5);
		Goods s=aaa.deal(a);                           //Deal the product
		Sale.sale(s);                                  //Sale the product
		
		Product b=new Product();					   //Get a product
		b.setNumber(3); 
		b.setPrice(8);
		b.setType(7);
		Sale.sale(b);                                  //Sale the product
		
		aaa.dealAndSell(b);
	}

}
