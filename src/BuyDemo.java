import java.util.Vector;

import buy.*;
import livestock.*;
public class BuyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The amount of money at first
		System.out.print("You have гд"+ResList.Instance().money+" at first.\n\n");
		//buy a chook
		Vector<Livestock> newChook=new BuyChook().start(1);
		System.out.print("The chook's ID is "+newChook.get(0).getId()+".\n\n");

		//buy a cow
		Vector<Livestock> newCow=new BuyCow().start(1);
		System.out.print("The cow's ID is "+newCow.get(0).getId()+".\n\n");
		
		//buy an ox
		Vector<Livestock> newOx=new BuyOx().start(1);
		System.out.print("The ox's ID is "+newOx.get(0).getId()+".\n\n");
		
		//buy a pig
		Vector<Livestock> newPig=new BuyPig().start(1);
		System.out.print("The pig's ID is "+newPig.get(0).getId()+".\n\n");
		
		//buy a sheep
		Vector<Livestock> newSheep=new BuySheep().start(1);
		System.out.print("The sheep's ID is "+newSheep.get(0).getId()+".\n\n");

		//buy 5 units of cabbage seed 
		new BuySeedOrFeed().addToList(0, 5);
		
		//buy 5 units of carrot seed 
		new BuySeedOrFeed().addToList(1, 5);
		
	    //buy 5 units of apple seed 
		new BuySeedOrFeed().addToList(2, 5);
		
		//buy 5 units of pear seed 
		new BuySeedOrFeed().addToList(3, 5);
		
		//buy 5 units of feed 
		new BuySeedOrFeed().addToList(4, 5);
	}

}
