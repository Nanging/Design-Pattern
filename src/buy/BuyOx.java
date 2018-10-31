package buy;
import livestock.*;

import buy.ResList.l_type;

public class BuyOx extends BuyLivestock{
	public BuyOx(){
		type = l_type.ox.id();
	}
	@Override
	public Livestock create(int id) {	
		Livestock ox = new Ox(id);
		return ox;
	}
	

}
