import java.util.Vector;

import livestock.*;
import thing.*;
public class LivestockDemo {
	public static void main(String[] args) {
		//new a chook
		Chook newchook=new Chook(1);
		//let chook drink
		newchook.nowstate.Drink();
		//feed chook
		newchook.nowstate.Feed();
		//get egg
		newchook.getEgg();
		
		//new a cow
		Cow newcow=new Cow(1);
		//let cow drink
		newcow.nowstate.Drink();
		//feed it
		newcow.nowstate.Feed();
		//get milk
		newcow.getMilk();
		
		//new a ox;
		Ox newox=new Ox(1);
		//let ox drink;
		newox.nowstate.Drink();
		//feed it
		newox.nowstate.Feed();
		//slaughter
		newox.slaughter();
		
		//new a sheep
		Sheep newsheep=new Sheep(1);
		// let sheep drink
		newsheep.nowstate.Drink();
		//feed it
		newsheep.nowstate.Feed();
		//get wool
		newsheep.getWool();
		
		//new a pig
		Pig newpig=new Pig(1);
		//let pig drink
		newpig.nowstate.Drink();
		//feed it
		newpig.nowstate.Feed();
		//slaughter
		newpig.slaughter();
		
	}

}