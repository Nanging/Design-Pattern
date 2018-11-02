package test;

import java.util.Scanner;

import thing.FieldContainer;

import buy.*;
public class LandUse {
	private Scanner in;
	public LandUse(Scanner in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}
	public void menu() {
		boolean loop = true;
//		Scanner in = new Scanner(System.in);
		do {
			System.out.println("choose operation");
			System.out.println("1.sow");
			System.out.println("2.irragation");
			System.out.println("3.fertilization");
			System.out.println("4.harvest");
			System.out.println("5.remove");
			System.out.println("6.exit");
			if (in.hasNextInt()==false) {
				System.out.println("wrong input");
				continue;
			}
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				sow();
				break;
			case 2:
				irrigate();
				break;
			case 3:
				fertilize();
				break;
			case 4:
				harvest();
				break;
			case 5:
				remove();
				break;
			case 6:
				loop = false;
				break;
			default:
				System.out.println("wrong input");
				break;
			}	
		} while (loop);
	}
	public void sow() {
		int landID = getLandID();
		int plantType = 0;
		System.out.println("enter your plant: 0 for cabbage, 1 for carrot, 2 for apple tree, 3 for pear tree");	
		boolean loop = true;
		do {
			if (in.hasNextInt()==false) {
				System.out.println("wrong input");
				in.next();
				continue;
			}	
			plantType = in.nextInt();
			loop = false;
		} while (loop);
		if(plantType>3||plantType<0) {
			System.out.println("wrong input");
			return;
		}
		if(ResList.Instance().s_list[plantType]<=0) {
			System.out.println("seed not enough");
			return;
		}
		FieldContainer.getInstance().sow(plantType, landID);
	}
	public void remove() {
		int landID = getLandID();
		FieldContainer.getInstance().remove(landID);
	}
	public void fertilize() {
		int landID = getLandID();
		FieldContainer.getInstance().fertilize(landID);
	}
	public void irrigate() {
		int landID = getLandID();
		FieldContainer.getInstance().irrigate(landID);
	}
	public void harvest() {
		int landID = getLandID();
		FieldContainer.getInstance().harvest(landID);
	}
	
	public int getLandID() {
		int landID = 0;
		System.out.println("enter the landID you want to operate");	
		boolean loop = true;
		do {
			if (in.hasNextInt()==false) {
				System.out.println("wrong input");
				in.next();
				continue;
			}	
			landID = in.nextInt();
			loop = false;
		} while (loop);
		return landID;
	}
}
