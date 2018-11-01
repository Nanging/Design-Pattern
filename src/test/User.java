package test;

import java.util.Scanner;

public class User {
	public void init() {//初始化都在这
		System.out.println("welcome to ???");
	}
	public void Menu() {//分功能执行
		boolean loop = true;
		
		do {
			System.out.println("1. 去农场");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. Exit");
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
				
				break;

			case 3:
				
				break;

			case 4:
				
				break;
			case 5:
				
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
