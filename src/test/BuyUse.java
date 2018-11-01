package test;
import buy.*;

import java.util.Scanner;

public class BuyUse {
	private Scanner in;
	public BuyUse(Scanner in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}
	
	public void menu(){	
		ResList resList = ResList.Instance();
		System.out.println("-------Welcome to shopping!-------");
		System.out.println("You have гд" + ResList.Instance().money + " now.");
		System.out.println("And you have " 
				+ resList.l_list.get(0).size() + " ox(en), "
				+ resList.l_list.get(1).size() + " sheep, " + 
				+ resList.l_list.get(2).size() + " chook(s), " + 
				+ resList.l_list.get(3).size() + " cow(s), " + 
				+ resList.l_list.get(4).size() + " pig(s), \n" +  
				+ resList.s_list[0] + " cabbage seed, "
				+ resList.s_list[1] + " carrot seed, " + 
				+ resList.s_list[2] + " apple seed, " + 
				+ resList.s_list[3] + " pear seed, \nand " + 
				+ resList.s_list[3] + " feed " + "now.");
		System.out.println("-----------------------------------------------");
		System.out.println("You can buy livestocks, seeds or feed here.");
		System.out.println("Enter the follwing number to choose what you want ot buy:");
		System.out.println("-------Livestocks-------");
		System.out.println("1. Ox");
		System.out.println("2. Sheep");
		System.out.println("3. Chook");
		System.out.println("4. Cow");
		System.out.println("5. Pig");
		System.out.println("-----Seeds or Feed------");
		System.out.println("6. Cabbage Seed");
		System.out.println("7. Carrot Seed");
		System.out.println("8. Apple Seed");
		System.out.println("9. Pear Seed");
		System.out.println("10. Feed");
		System.out.println("------------------------");
		System.out.println("11. Cancel");
		System.out.print("Please enter the nunber:");
		int flag = 0;
		int amount = 0;
		BuyLivestock buyLivestock = null;
		if(in.hasNextInt())
			flag = in.nextInt();
		switch (flag) {
		case 1:
			System.out.print("Please enter the amount you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			
			buyLivestock = new BuyOx();
			buyLivestock.start(amount);
			System.out.println("Now you have " + resList.l_list.get(0).size() + " ox(en) now.");
			break;
		case 2:
			System.out.print("Please enter the amount you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			
			buyLivestock = new BuySheep();
			buyLivestock.start(amount);
			System.out.println("Now you have " + resList.l_list.get(0).size() + " sheep now.");			
			break;
		case 3:
			System.out.print("Please enter the amount you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			
			buyLivestock = new BuyChook();
			buyLivestock.start(amount);
			System.out.println("Now you have " + resList.l_list.get(0).size() + " chook(s) now.");			
			break;
		case 4:
			System.out.print("Please enter the amount you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			
			buyLivestock = new BuyCow();
			buyLivestock.start(amount);
			System.out.println("Now you have " + resList.l_list.get(0).size() + " cow(s) now.");		
			break;
		case 5:
			System.out.print("Please enter the amount you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			
			buyLivestock = new BuyPig();
			buyLivestock.start(amount);
			System.out.println("Now you have " + resList.l_list.get(0).size() + " pig(s) now.");		
			break;
		case 6:

			break;
		case 11:
			break;
		default:
			System.out.println("wrong input");
			break;
		}	

	}
	
}
