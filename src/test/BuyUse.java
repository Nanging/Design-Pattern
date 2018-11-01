package test;
import buy.BuyOx;
import buy.BuySeedOrFeed;
import buy.ResList;

import java.util.Scanner;

public class BuyUse {
	private Scanner in;
	public BuyUse(Scanner in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}
	
	public void menu(){	
		ResList resList = ResList.Instance();
		System.out.println("-------Welcome to buy somthing!-------");
		System.out.println("You have гд" + ResList.Instance().money + " now.");
		System.out.println("And you have " + resList.l_list.get(0).size() + " ox(en) now.");
		System.out.println("And you can buy livestocks, seeds or feed here.");
		System.out.println("Enter the follwing number to choose what you want ot buy:");
		System.out.println("-------Livestocks-------");
		System.out.println("1. Ox");
		System.out.println("2. Sheep");
		System.out.println("3. Chook");
		System.out.println("4. Cow");
		System.out.println("5. Pig");
		System.out.println("-----Seeds or Feed------");
		System.out.println("6. CabbageSeed");
		System.out.println("7. CarrotSeed");
		System.out.println("8. AppleSeed");
		System.out.println("9. PearSeed");
		System.out.println("10. Feed");
		System.out.println("------------------------");
		System.out.println("11. Cancel");
		System.out.print("Please enter the nunber:");
		int flag = 0;
		int amount = 0;
		if(in.hasNextInt())
			flag = in.nextInt();
		switch (flag) {
		case 1:
			System.out.print("Please enter the amount you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			
			BuyOx buyox = new BuyOx();
			buyox.start(amount);
			System.out.println("Now you have " + resList.l_list.get(0).size() + " ox(en) now.");
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		case 4:
			
			break;
		case 5:
			
			break;
		case 6:

			System.out.print("Please enter the amount of cabbage seed you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			new BuySeedOrFeed().addToList(0, amount);
			System.out.println("Now you have " + resList.s_list[0] + " unit(s) of cabbage seed now.");
			break;
		case 7:

			System.out.print("Please enter the amount of carrot seed you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			new BuySeedOrFeed().addToList(1, amount);
			System.out.println("Now you have " + resList.s_list[1] + " unit(s) of carrot seed now.");
			break;
		case 8:

			System.out.print("Please enter the amount of apple seed you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			new BuySeedOrFeed().addToList(2, amount);
			System.out.println("Now you have " + resList.s_list[2] + " unit(s) of apple seed now.");
			break;
		case 9:

			System.out.print("Please enter the amount of pear seed you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			new BuySeedOrFeed().addToList(3, amount);
			System.out.println("Now you have " + resList.s_list[3] + " unit(s) of pear seed now.");
			break;
		case 10:

			System.out.print("Please enter the amount of feed you want to buy:");
			if(in.hasNextInt())
				amount = in.nextInt();
			new BuySeedOrFeed().addToList(4, amount);
			System.out.println("Now you have " + resList.s_list[4] + " unit(s) of feed seed now.");
			break;
		case 11:
			break;
		default:
			System.out.println("wrong input");
			break;
		}	

	}
	
}
