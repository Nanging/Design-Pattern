package thing;

import plant.Plant;

public class Land {
	
	private Plant plant = null;//�����ϵ�ֲ��
	private int landID; //���ص����

	public int getLandID() {
		return landID;
	}
	public Land(int landID) {
		this.landID = landID;
	}
	public void sow(Plant plant) {
		this.plant = plant;
	}
	public void remove() {
		this.plant = null;
	}
	public void fertilize() {
		plant.fertilized();
	}
	public void irrigate() {
		plant.irrigated();
	}
	public void harvest() {
		if (!plant.harvest()) {
			remove();
		}
	}
	public void showState() {
		System.out.print("��ֲ���");
		plant.showType();
		System.out.print("     ״̬��");
		plant.showPlantState();
		System.out.print("\n");
	}

}
