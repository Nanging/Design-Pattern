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
		System.out.println("你现在已经来到了农场\n\n");
		boolean loop = true;
		do {
			System.out.println("现在你可以执行以下操作：");
			System.out.println("1. 创建新的土地");
			System.out.println("2. 对土地进行操作（播种、浇水、施肥、收获、移除作物）");
			System.out.println("3. 查看所有土地状态");
			System.out.println("4. 离开");
//			Scanner in = new Scanner(System.in);
			if (in.hasNextInt()==false) {
				System.out.println("错误输入");
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
				System.out.println("错误输入");
				break;
			}	
		} while (loop);
		
		System.out.println("-------------EXIT-------------");
	}
	public void showLandState() {
		FieldContainer fieldContainer = FieldContainer.getInstance();
		ArrayList<Land> lands =  fieldContainer.getLands();
		ArrayList<Land> unlands =  fieldContainer.getEmptyLands();
		System.out.println("你当前拥有"+(lands.size()+unlands.size())+"块土地：\n");
		for (Land land : lands) {
			System.out.println("土地 "+land.getLandID()+" : ");
			land.showState();
		}
		for (Land land : unlands) {
			System.out.println("土地 "+land.getLandID()+" : ");
			System.out.println("未种植作物");
		}
	}
	
}
