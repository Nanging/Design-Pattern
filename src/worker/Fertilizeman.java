package worker;

import thing.FieldContainer;

public class Fertilizeman extends Worker {
	Fertilizeman(){this.type="fertilize";};
	public void fertilize(int landID) {
		FieldContainer.getInstance().fertilize(landID);
	}
	
}
