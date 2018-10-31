package buy;
import livestock.*;
import java.util.Vector;

import buy.ResList.l_type;

public class BuyCow extends BuyLivestock{
	public BuyCow(){
		type = l_type.cow.id();
	}
	@Override
	public Livestock create(int id) {	
		Livestock cow = new Cow(id);
		return cow;
	}
	


}