package worker;

import thing.FieldContainer;

public class Harvestman extends Worker {
	Harvestman(){this.type="harvest";};
	public void harvest(int landID) {
		FieldContainer.getInstance().harvest(landID);
	}
 
}
