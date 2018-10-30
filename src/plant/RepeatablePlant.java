package plant;

import thing.PlantState;

public abstract class RepeatablePlant extends Plant {



	@Override
	public boolean harvest() {
		// TODO Auto-generated method stub
		growState.harvest(this);
		return true;
	}


}
