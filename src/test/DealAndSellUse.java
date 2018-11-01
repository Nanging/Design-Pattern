package test;

import java.util.Scanner;

import construction.Factory;
import construction.Farm;
import construction.Sale;
import construction.Warehouse;
import thing.FieldContainer;
import thing.Product;
import thing.ProductType;

public class DealAndSellUse {
	private Scanner in;
	public DealAndSellUse(Scanner in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}
	
	public void menu() {
		System.out.println("\nThe order list");
		boolean loop = true;
		Farm farm = Farm.getInstance();
		
		Warehouse ware=farm.getWarehouse();
		Factory factory=farm.getFactory();
		do {
			System.out.println("\n1.Get the list");
			System.out.println("2.Sell the products");
			System.out.println("3.Sell the goods");
			System.out.println("4.Exit");
			if (in.hasNextInt()==false) {
				System.out.println("��������");
				in.next();
//				in.close();
				continue;
			}
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Show the list:");
				ware.showAmount();
				break;
			case 2:		
				System.out.print("Enter the order of the product you want to sell:\n");
				int type = in.nextInt();
				System.out.print("Enter the number of the product you want to sell:\n");
				int num = in.nextInt();
				Sale.sale(ware.getProduct(type, num));
				break;
			case 3:
				System.out.print("Enter the order of the goods you want to sell:\n");
				int type1 = in.nextInt();
				System.out.print("Enter the number of the goods you want to sell:\n");
				int num1 = in.nextInt();
				ware.showAmount();
				factory.dealAndSell(ware.getProduct(type1, num1));
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("��������");
				break;
			}	
		}while(loop);
		
		System.out.println("-------------EXIT-------------");
	}
}
