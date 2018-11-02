package test;

import java.util.Scanner;
import buy.*;
public class User {
	public void init() {
		System.out.println("welcome to JiaDing Farm");
		
	}
	public void Menu() {
		boolean loop = true;
		ResList.Instance();
		do {
			System.out.println("1.Go to Farm Land");
			System.out.println("2.Buy");
			System.out.println("3.Weather ");
			System.out.println("4.Sell and Deal ");
			System.out.println("5.go to livestock farm ");
			System.out.println("6. Exit");
			Scanner in = new Scanner(System.in);
			if (in.hasNextInt()==false) {
				System.out.println("wrong input");
				in.next();
				continue;
			}
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				new FarmUse(in).menu();
				break;
			case 2:
				new BuyUse(in).menu();				
				break;
				
			case 3:
				new WeatherUse(in).menu();
				break;

			case 4:
				new DealAndSellUse(in).menu();
				break;

			case 5:
				new LivestockUse(in).menu();
				break;
			case 6:
				loop = false;
				break;
			default:
				System.out.println("wrong input");
				break;
			}	
				
		} while (loop);

		System.out.println("-------------EXIT-------------");
	}


}
