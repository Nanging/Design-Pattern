package buy;
import livestock.*;
import java.util.Vector;

import buy.ResList.l_type;

public class BuyPig extends BuyLivestock{
	private int type = l_type.pig.id();//指明该类type对应的枚举量
	
	@Override
	public Livestock create(int id) {	
		Livestock pig = new Pig(id);
		return pig;
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