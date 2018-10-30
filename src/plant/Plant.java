package plant;

import thing.PlantState;
import thing.Product;

public abstract class Plant {
	protected PlantState growState;
	public void showPlantState() {
		growState.showState();
	}
	public void fertilized() {
		// TODO Auto-generated method stub
		growState.fertilized(this);
	}

	public void irrigated() {
		// TODO Auto-generated method stub
		growState.irrigated(this);
	}


	public abstract void getProduct();
	public abstract boolean harvest();
	public void changeState(PlantState state) {
		growState = state;
	}

}
