package test;

import java.util.Scanner;

public class User {
	public void init() {//��ʼ��������
		System.out.println("welcome to ???");
	}
	public void Menu() {//�ֹ���ִ��
		boolean loop = true;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("1. Farm");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. ");
			System.out.println("1. Exit");
			if (in.hasNextInt()==false) {
				System.out.println("wrong input");
				in.next();
				continue;
			}
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				
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
		in.close();
		System.out.println("-------------EXIT-------------");
	}


}
