package worker;

import thing.FieldContainer;

public class Irrigateman extends  Worker{
	Irrigateman(){this.type="irrigate";};
	

	@Override
	public void action(int id) {
		// TODO Auto-generated method stub
		FieldContainer.getInstance().irrigate(id);
	}
}
