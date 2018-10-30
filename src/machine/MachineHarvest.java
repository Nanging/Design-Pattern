package machine;

import java.util.ArrayList;

import thing.FieldContainer;
import thing.Land;

public class MachineHarvest implements MachineWork{
public void doWork() {
		ArrayList<Land> lands=FieldContainer.getInstance().getLands();
		for(Land l : lands) {
			l.harvest();
		}
	}
}
