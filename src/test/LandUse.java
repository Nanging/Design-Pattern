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
			System.out.println("��ѡ��Ҫִ�еĲ�����");
			System.out.println("1. ����");
			System.out.println("2. ��ˮ");
			System.out.println("3. ʩ��");
			System.out.println("4. �ջ�");
			System.out.println("5. �Ƴ�");
			System.out.println("6. �뿪");
			if (in.hasNextInt()==false) {
				System.out.println("��������");
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
				System.out.println("��������");
				break;
			}	
		} while (loop);
	}
	public void sow() {
		int landID = getLandID();
		int plantType = 0;
		System.out.println("�������㲥�ֵ�ֲ�0.���ˣ�1.�ܲ���2.ƻ����3.�棩��");	
		boolean loop = true;
		do {
			if (in.hasNextInt()==false) {
				System.out.println("�������룬����������");
				in.next();
				continue;
			}	
			plantType = in.nextInt();
			loop = false;
		} while (loop);
		/* �����������ٴ���
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		if(plantType>3||plantType<0) {
			System.out.println("û�и�����");
			return;
		}
		if(ResList.Instance().s_list[plantType]<=0) {
			System.out.println("���Ӳ���");
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
		System.out.println("��������Ҫ���������غţ�");	
		boolean loop = true;
		do {
			if (in.hasNextInt()==false) {
				System.out.println("�������룬����������");
				in.next();
				continue;
			}	
			landID = in.nextInt();
			loop = false;
		} while (loop);
		return landID;
	}
}
