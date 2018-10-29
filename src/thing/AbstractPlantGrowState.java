package thing;

import plant.Plant;

public interface AbstractPlantGrowState {
	public void showState();
	public void fertilized(Plant plant);
	public void irrigated(Plant plant);
	public boolean harvest(Plant plant);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
