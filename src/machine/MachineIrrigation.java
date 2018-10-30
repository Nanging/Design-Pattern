package machine;
import java.util.ArrayList;

import thing.*;
public class MachineIrrigation {
public void doWork() {
		ArrayList<Land> lands=FieldContainer.getInstance().getLands();
		for(Land l : lands) {
			l.irrigate();
		}
	}
}
