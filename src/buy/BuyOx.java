package buy;
import livestock.*;
import java.util.Vector;

import buy.ResList.l_type;

public class BuyOx extends BuyLivestock{
	private int type = l_type.ox.id();//Indicate the enumeration corresponding to the type

	@Override
	public Livestock create(int id) {	
		Livestock ox = new Ox(id);
		return ox;
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
