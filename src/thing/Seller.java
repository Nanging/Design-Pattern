package thing;

import construction.Sale;

public class Seller {
	public int sellGoods(Goods goods) {
		return Sale.sale(goods);
	}
}
