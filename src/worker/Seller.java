package worker;

import construction.Sale;
import thing.Goods;

public class Seller {
	public void sell(Goods goods) {
		Sale.sale(goods);
	}
}
