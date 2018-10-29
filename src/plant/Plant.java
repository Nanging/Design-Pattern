package plant;

import thing.AbstractPlantGrowState;
import thing.Product;

public abstract class Plant {
	protected AbstractPlantGrowState growState;
	
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
	
	public abstract boolean harvest(AbstractPlantGrowState state);
	public abstract Product getResult();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void changeState(AbstractPlantGrowState state) {
		growState = state;
	}

}
