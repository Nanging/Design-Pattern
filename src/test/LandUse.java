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
			System.out.println("请选择要执行的操作：");
			System.out.println("1. 播种");
			System.out.println("2. 浇水");
			System.out.println("3. 施肥");
			System.out.println("4. 收获");
			System.out.println("5. 移除");
			System.out.println("6. 离开");
			if (in.hasNextInt()==false) {
				System.out.println("错误输入");
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
				System.out.println("错误输入");
				break;
			}	
		} while (loop);
	}
	public void sow() {
		int landID = getLandID();
		int plantType = 0;
		System.out.println("请输入你播种的植物（0.包菜，1.萝卜，2.苹果，3.梨）：");	
		boolean loop = true;
		do {
			if (in.hasNextInt()==false) {
				System.out.println("错误输入，请重新输入");
				in.next();
				continue;
			}	
			plantType = in.nextInt();
			loop = false;
		} while (loop);
		/* 种子数量减少代码
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		if(plantType>3||plantType<0) {
			System.out.println("没有该作物");
			return;
		}
		if(ResList.Instance().s_list[plantType]<=0) {
			System.out.println("种子不够");
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
		System.out.println("请输入你要操作的土地号：");	
		boolean loop = true;
		do {
			if (in.hasNextInt()==false) {
				System.out.println("错误输入，请重新输入");
				in.next();
				continue;
			}	
			landID = in.nextInt();
			loop = false;
		} while (loop);
		return landID;
	}
}
