package buy;
import livestock.*;
import java.util.Vector;

import com.sun.javadoc.Type;

public abstract class BuyLivestock extends Buy{
	ResList reslist = ResList.Instance();
	public Vector<Livestock> llist = new Vector<Livestock>();
	public int type = -1; 
	
	public void addToList(int type, int num){//Add new livestock to the list
		reslist.l_list.get(type).addAll(llist);
		switch (type){
			case 0:
				reslist.money -= 1000*num;
				break;			
			case 1:
				reslist.money -= 500*num;
				break;
			case 2:	
				reslist.money -= 5*num;
				break;				
			case 3:
				reslist.money -= 20*num;
				break;
			case 4:
				reslist.money -= 300*num;
				break;
		};
	}

	public abstract Livestock create(int id);	//Call this function to generate new livestock

	public Vector<Livestock> start(int num){//
		int id1 = reslist.l_list.get(type).size();
		for(int i = 0; i < num; i++){
			llist.addElement(create(id1));
			id1++;
		}
		addToList(type, num);
		System.out.print("You have bought "+num+" Livestock(s) successfully. You still have гд"+reslist.money+" left.\n");
		return llist;
	}
}
