package buy;
import livestock.*;
import java.util.Vector;

import buy.ResList.l_type;

public class BuySheep extends BuyLivestock{
	public BuySheep(){
		type = l_type.sheep.id();
	}
	@Override
	public Livestock create(int id) {	
		Livestock sheep = new Sheep(id);
		return sheep;
	}


}