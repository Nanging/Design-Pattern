package test;

import java.util.ArrayList;
import java.util.Scanner;

import plant.AppleTree;
import plant.Cabbage;
import plant.Carrot;
import plant.PearTree;
import thing.FieldContainer;
import thing.Land;

public class FarmUse {
	private Scanner in;
	public FarmUse(Scanner in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}
	public void menu() {
		System.out.println("now you are at farmland\n\n");
		boolean loop = true;
		do {
			System.out.println("Operations:");
			System.out.println("1.make new land");
			System.out.println("2.irragation/fertilization/harvest/remove operations");
			System.out.println("3.show lands state");
			System.out.println("4.exit");
//			Scanner in = new Scanner(System.in);
			if (in.hasNextInt()==false) {
				System.out.println("wrong input");
				System.out.println("---------"+in.next()+"++++++++++++++");
//				in.close();
				continue;
			}
			int choice = in.nextInt();
//			in.close();
			switch (choice) {
			case 1:
				FieldContainer.getInstance().makeNewLand();
				break;
			case 2:
				new LandUse(in).menu();
				break;
			case 3:
				showLandState();
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("wrong input");
				break;
			}	
		} while (loop);
		
		System.out.println("-------------EXIT-------------");
	}
	public void showLandState() {
		FieldContainer fieldContainer = FieldContainer.getInstance();
		ArrayList<Land> lands =  fieldContainer.getLands();
		ArrayList<Land> unlands =  fieldContainer.getEmptyLands();
		System.out.println("you have"+(lands.size()+unlands.size())+"lands: \n");
		for (Land land : lands) {
			System.out.println("land"+land.getLandID()+":");
			land.showState();
		}
		for (Land land : unlands) {
			System.out.println("land "+land.getLandID()+":");
			System.out.println("uncultivated");
		}
	}
	
}
