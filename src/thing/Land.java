package thing;

import plant.Plant;

public class Land {
	
	private Plant plant = null;//土地上的植物
	private int landID; //土地的序号

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
