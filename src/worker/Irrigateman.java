package worker;

import thing.FieldContainer;

public class Irrigateman extends  Worker{
	Irrigateman(){this.type="irrigate";};
	
	
	public void irrigate(int landID) {
		FieldContainer.getInstance().irrigate(landID);
	}
}
