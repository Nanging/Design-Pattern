package test;

import java.util.ArrayList;
import java.util.Scanner;

import livestock.*;
import thing.*;

public class LivestockUse {
	private Scanner in;
	private ArrayList<Ox> oxList = new ArrayList<Ox>();
	private ArrayList<Cow> cowList = new ArrayList<Cow>();
	private ArrayList<Pig> pigList = new ArrayList<Pig>();
	private ArrayList<Sheep> sheepList = new ArrayList<Sheep>();
	private ArrayList<Chook> chookList = new ArrayList<Chook>();

	public LivestockUse(Scanner in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}
	public void menu() {
		System.out.println("You have come to the livestock farm.\n\n");
		boolean loop = true;
		do {
			System.out.println("Now you can choose the following operation.");
			System.out.println("1.Put in new livestock.");
			System.out.println("2.Feeding livestock");
			System.out.println("3.Get products from livestock");
			System.out.println("4.View livestock status");
			System.out.println("5.exit");
//			Scanner in = new Scanner(System.in);
			if (in.hasNextInt()==false) {
				System.out.println("Error input");
				System.out.println("---------"+in.next()+"++++++++++++++");
//				in.close();
				continue;
			}
			int choice = in.nextInt();
//			in.close();
			switch (choice) {
			case 1:
				System.out.println("Please choose livestock species.");
				System.out.println("1.pig");
				System.out.println("2.ox");
				System.out.println("3.cow");
				System.out.println("4.chook");
				System.out.println("5.sheep");
				if (in.hasNextInt()==false) {
					System.out.println("Error input");
					System.out.println("---------"+in.next()+"++++++++++++++");
//					in.close();
					continue;
				}
			    choice = in.nextInt();
			    switch (choice) {
			    case 1:
			    	if(pigList.size()==0){
			    		pigList.add(new Pig(1));
			    	}
			    	else pigList.add(new Pig(pigList.get(pigList.size()-1).getId()+1));
			    	break;
			    case 2:
			    	if(oxList.size()==0)
			    	{
			    		oxList.add(new Ox(1));
			    	}
			    	oxList.add(new Ox(oxList.get(oxList.size()-1).getId()+1));
			    	break;
			    case 3:
			    	if(cowList.size()==0)
			    	{
			    		cowList.add(new Cow(1));
			    	}
			    	cowList.add(new Cow(cowList.get(cowList.size()-1).getId()+1));
			    	break;
			    case 4:
			    	if(chookList.size()==0)
			    	{
			    		chookList.add(new Chook(1));
			    	}
			    	chookList.add(new Chook(chookList.get(chookList.size()-1).getId()+1));
			    	break;
			    case 5:
			    	if(sheepList.size()==0)
			    	{
			    		sheepList.add(new Sheep(1));
			    	}
			    	sheepList.add(new Sheep(sheepList.get(sheepList.size()-1).getId()+1));
			    	break;
			    }
				System.out.println("Put into success");
				break;
			case 2:
				feedandDrink();
				break;
			case 3:
				System.out.println("Please choose livestock species.");
				System.out.println("1.pig");
				System.out.println("2.ox");
				System.out.println("3.cow");
				System.out.println("4.chook");
				System.out.println("5.sheep");
				if (in.hasNextInt()==false) {
					System.out.println("Error input");
					System.out.println("---------"+in.next()+"++++++++++++++");
//					in.close();
					continue;
				}
			    choice = in.nextInt();
			    switch (choice) {
			    case 1:
			    	System.out.println("Please input ID.");
					if (in.hasNextInt()==false) {
						System.out.println("error input");
						System.out.println("---------"+in.next()+"++++++++++++++");
//						in.close();
						continue;
					}
				    choice = in.nextInt();
				    if(pigList.get(choice).slaughter() == true) {
				    	pigList.remove(choice);
				    }
				    else System.out.println("It can't be slaughtered..");
			    case 2:
			    	System.out.println("Please input ID.");
					if (in.hasNextInt()==false) {
						System.out.println("error input");
						System.out.println("---------"+in.next()+"++++++++++++++");
//						in.close();
						continue;
					}
				    choice = in.nextInt();
				    if(oxList.get(choice).slaughter() == true) {
				    	oxList.remove(choice);
				    }
				    else System.out.println("It can't be slaughtered..");
			    case 3:
			    	System.out.println("Please input ID.");
					if (in.hasNextInt()==false) {
						System.out.println("error input");
						System.out.println("---------"+in.next()+"++++++++++++++");
//						in.close();
						continue;
					}
				    choice = in.nextInt();
				    if(!cowList.get(choice).getMilk())
				    	System.out.println("It can't be milked.");

			    case 4:
			    	System.out.println("Please input ID.");
					if (in.hasNextInt()==false) {
						System.out.println("error input");
						System.out.println("---------"+in.next()+"++++++++++++++");
//						in.close();
						continue;
					}
				    choice = in.nextInt();
				    if(!chookList.get(choice).getEgg())
				    	System.out.println("It have not egg.");
			    case 5:
			    	System.out.println("Please input ID.");
					if (in.hasNextInt()==false) {
						System.out.println("error input");
						System.out.println("---------"+in.next()+"++++++++++++++");
//						in.close();
						continue;
					}
				    choice = in.nextInt();
				    if(!sheepList.get(choice).getWool())
				    	System.out.println("It can't be wooled.");
			    }
				System.out.println("Get ahead");
				break;
			case 4:
		    	System.out.println("\n Pig state（0：young；1：mature）：\n");
		    	for(Pig A : pigList) {
			    	System.out.println("pig：ID "+A.getId()+" state： "+A.nowstate.getState());
		    	}
		    	System.out.println("\n Ox state（0：young；1：mature）：\n");
		    	for(Ox A : oxList) {
			    	System.out.println("Ox：ID "+A.getId()+" state： "+A.nowstate.getState());
		    	}
		    	System.out.println("\n cow state（0：young；1：mature）：\n");
		    	for(Cow A : cowList) {
			    	System.out.println("cow：ID "+A.getId()+" state： "+A.nowstate.getState());
		    	}
		    	System.out.println("\n chook（0：young；1：mature）：\n");
		    	for(Chook A : chookList) {
			    	System.out.println("chook：ID "+A.getId()+" state： "+A.nowstate.getState());
		    	}
		    	System.out.println("\n sheep（0：young；1：mature）：\n");
		    	for(Sheep A : sheepList) {
			    	System.out.println("sheep：ID "+A.getId()+" state： "+A.nowstate.getState());
		    	}
				break;
			default:
				System.out.println("��������");
				break;
			}	
		} while (loop);
		
		System.out.println("-------------EXIT-------------");
	}
	public void feedandDrink() {
		int t=1;
		System.out.println("Please choose livestock species");
		System.out.println("1.pig ");
		System.out.println("2.ox ");
		System.out.println("3.cow ");
		System.out.println("4.chook ");
		System.out.println("5.sheep");
		int choice = in.nextInt();
		System.out.println("Please import livestock ID");
		switch (choice) {
		case 1:
			choice = in.nextInt();
			for(int i = 0;i < pigList.size(); i ++){
				if(pigList.get(i).getId()==choice) {
					System.out.println("drink or feed");
					System.out.println("1.feed");
					System.out.println("2.drink");
					choice= in.nextInt();
					if(choice==1)
					{
						pigList.get(i).nowstate.Feed();
						//System.out.println(pigList.get(i).nowstate.getState());
						System.out.println("feed success");
					}
					else if(choice==2)
					{
						pigList.get(i).nowstate.Drink();;
						System.out.println("drink success");
					}
					t=0;
					break;
				}
			}
			if(t==1)
				System.out.println("The animal does not exist or is dead.");
			break;
		case 2:
			choice = in.nextInt();
			for(int i = 0;i < oxList.size(); i ++){
				if(oxList.get(i).getId()==choice) {
					System.out.println("drink or feed");
					System.out.println("1.feed");
					System.out.println("2.drink");
					choice= in.nextInt();
					if(choice==1)
					{
						oxList.get(i).nowstate.Feed();
						System.out.println("feed success");
					}
					else if(choice==2)
					{
						oxList.get(i).nowstate.Drink();;
						System.out.println("drink success");
					}
					t=0;
					break;
				}
			}
			if(t==1)
				System.out.println("The animal does not exist or is dead.");
			break;
		case 3:
			choice = in.nextInt();
			for(int i = 0;i < cowList.size(); i ++){
				if(cowList.get(i).getId()==choice) {
					System.out.println("drink or feed");
					System.out.println("1.feed");
					System.out.println("2.drink");
					choice= in.nextInt();
					if(choice==1)
					{
						cowList.get(i).nowstate.Feed();
						System.out.println("feed success");
					}
					else if(choice==2)
					{
						cowList.get(i).nowstate.Drink();;
						System.out.println("drink success");
					}
					t=0;
					break;
				}
			}
			if(t==1)
				System.out.println("The animal does not exist or is dead.");
			break;
		case 4:
			choice = in.nextInt();
			for(int i = 0;i < chookList.size(); i ++){
				if(chookList.get(i).getId()==choice) {
					System.out.println("drink or feed");
					System.out.println("1.feed");
					System.out.println("2.drink");
					choice= in.nextInt();
					if(choice==1)
					{
						chookList.get(i).nowstate.Feed();
						System.out.println("feed success");
					}
					else if(choice==2)
					{
						chookList.get(i).nowstate.Drink();;
						System.out.println("drink success");
					}
					t=0;
					break;
				}
			}
			if(t==1)
				System.out.println("The animal does not exist or is dead.");
			break;
		case 5:
			choice = in.nextInt();
			for(int i = 0;i < sheepList.size(); i ++){
				if(sheepList.get(i).getId()==choice) {
					System.out.println("drink or feed");
					System.out.println("1.feed");
					System.out.println("2.drink");
					choice= in.nextInt();
					if(choice==1)
					{
						sheepList.get(i).nowstate.Feed();
						System.out.println("feed success");
					}
					else if(choice==2)
					{
						sheepList.get(i).nowstate.Drink();;
						System.out.println("drink success");
					}
					t=0;
					break;
				}
			}
			if(t==1)
				System.out.println("The animal does not exist or is dead.");
			break;
		default:
			System.out.println("error input");
			break;
		
		}
		
	}
	
}
