package plant;

import thing.AbstractPlantGrowState;

public abstract class Fruit extends Plant {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean harvest(AbstractPlantGrowState state) {
		// TODO Auto-generated method stub
		growState.harvest(this);
		return true;
	}


}
