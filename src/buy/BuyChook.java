package buy;
import livestock.Livestock;
import livestock.Chook;

import buy.ResList.l_type;

public class BuyChook extends BuyLivestock{
	public BuyChook(){
		type = l_type.chook.id();
	}	
	@Override
	public Livestock create(int id) {	
		Livestock chook = new Chook(id);
		return chook;
	}

}