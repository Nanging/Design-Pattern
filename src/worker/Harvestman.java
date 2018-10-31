package worker;

import thing.FieldContainer;

public class Harvestman extends Worker {
	Harvestman(){this.type="harvest";};
	@Override
	public void action(int id) {
		// TODO Auto-generated method stub
		FieldContainer.getInstance().harvest(id);
	}
 
}
