package buy;
import livestock.Livestock;
import java.util.Vector;
import livestock.Chook;

import buy.ResList.l_type;

public class BuyChook extends BuyLivestock{
	private int type = l_type.chook.id();//指明该类type对应的枚举量
	
	@Override
	public Livestock create(int id) {	
		Livestock chook = new Chook(id);
		return chook;
	}
	
	@Override
	public Vector<Livestock> start(int num){//
		int id1 = reslist.l_list.get(type).size();
		for(int i = 0; i < num; i++){
			llist.addElement(create(id1));
			id1++;
		}
		addToList(type, num);
		return llist;
	}

}