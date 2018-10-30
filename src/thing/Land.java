package thing;

import plant.Plant;

public class Land {
	private Plant plant = null;
	private int landID;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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

}
