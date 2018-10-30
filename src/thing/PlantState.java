package thing;

import plant.Plant;

public interface PlantState {
	public void showState();
	public void fertilized(Plant plant);
	public void irrigated(Plant plant);
	public boolean harvest(Plant plant);
}
