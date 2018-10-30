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
	 
		CabbageGoods cabbageGoods = new CabbageGoods();
		cabbageGoods.setId(0);
		shapeMap.put(cabbageGoods.getId(),cabbageGoods);
		
		CarrotGoods carrotGoods = new CarrotGoods();
		carrotGoods.setId(1);
		shapeMap.put(carrotGoods.getId(),carrotGoods);
		
		AppleGoods appleGoods = new AppleGoods();
		appleGoods.setId(2);
		shapeMap.put(appleGoods.getId(),appleGoods);
		
		PearGoods pearGoods = new PearGoods();
		pearGoods.setId(3);
		shapeMap.put(pearGoods.getId(),pearGoods);
		
		BeefGoods beefGoods = new BeefGoods();
		beefGoods.setId(4);
		shapeMap.put(beefGoods.getId(),beefGoods);
		
		PorkGoods porkGoods = new PorkGoods();
		porkGoods.setId(5);
		shapeMap.put(porkGoods.getId(),porkGoods);
		
		EggGoods eggGoods = new EggGoods();
		eggGoods.setId(6);
		shapeMap.put(eggGoods.getId(),eggGoods);
		
		WoolGoods woolGoods = new WoolGoods();
		woolGoods.setId(7);
		shapeMap.put(woolGoods.getId(),woolGoods);

		MilkGoods milkGoods = new MilkGoods();
		milkGoods.setId(8);
		shapeMap.put(milkGoods.getId(),milkGoods);


 }

}
