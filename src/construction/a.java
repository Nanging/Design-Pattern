package construction;

import thing.Goods;
import thing.Product;

public class a {

	public static void main(String[] args) {
		Goods a=new Goods();
		a.setNumber(2);
		a.setPrice(5);
		a.setId(2);
		System.out.println(Sale.sale(a));
		

	}

}
