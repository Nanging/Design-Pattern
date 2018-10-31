package worker;

import thing.FieldContainer;

public class Fertilizeman extends Worker {
	Fertilizeman(){this.type="fertilize";};
	@Override
	public void action(int id) {
		// TODO Auto-generated method stub
		FieldContainer.getInstance().fertilize(id);
	}
	
}
