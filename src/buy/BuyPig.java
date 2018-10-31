package buy;
import livestock.*;
import java.util.Vector;

import buy.ResList.l_type;

public class BuyPig extends BuyLivestock{
	public BuyPig(){
		type = l_type.pig.id();
	}
	@Override
	public Livestock create(int id) {	
		Livestock pig = new Pig(id);
		return pig;
	}
	

}