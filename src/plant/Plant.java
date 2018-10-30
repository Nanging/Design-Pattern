package plant;

import thing.PlantState;
import thing.Product;

public abstract class Plant {
	protected PlantState growState;
	
	public void fertilized() {
		// TODO Auto-generated method stub
		growState.fertilized(this);
	}

	public void irrigated() {
		// TODO Auto-generated method stub
		growState.irrigated(this);
	}

	public boolean harvest() {
		return harvest(growState);
	}
	
	public abstract boolean harvest(PlantState state);
	public abstract Product getResult();
	public void changeState(PlantState state) {
		growState = state;
	}

}
