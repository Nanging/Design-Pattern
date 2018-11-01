package test;
import buy.BuyOx;
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

			break;
		case 11:
			break;
		default:
			System.out.println("wrong input");
			break;
		}	

	}
	
}
