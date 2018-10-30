package thing;

import java.util.Hashtable;

public class GoodsCache {
	
	private static Hashtable<Integer, Goods> shapeMap 
    = new Hashtable<Integer, Goods>();

    public static Goods getShape(int id) {
	  Goods cachedShape = shapeMap.get(id);
      return (Goods) cachedShape.clone();
    }

    public static void loadCache() {
	 
		EggGoods eggGoods = new EggGoods();
		eggGoods.setId(1);
		shapeMap.put(eggGoods.getId(),eggGoods);
		
		ChickenGoods chickenGoods = new ChickenGoods();
		chickenGoods.setId(2);
		shapeMap.put(chickenGoods.getId(),chickenGoods);
		 
		MilkGoods milkGoods = new MilkGoods();
		milkGoods.setId(3);
		shapeMap.put(milkGoods.getId(),milkGoods);
		
		CornGoods cornGoods = new CornGoods();
		cornGoods.setId(4);
		shapeMap.put(cornGoods.getId(),cornGoods);

 }

}
