package plant;

import thing.PlantState;

public abstract class DisposablePlant extends Plant {
	

	/*
	 * 
	 */
	@Override
	public boolean harvest(PlantState state) {
		// TODO Auto-generated method stub
		growState.harvest(this);
		return false;
	}
}
