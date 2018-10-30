import thing.*;

import java.util.ArrayList;

import machine.*;

public class MachineworkDemo {						//strategy pattern
	public static void main(String[] args) {
		FieldContainer fc = FieldContainer.getInstance();
		System.out.println("-----");
		fc.makeNewLand();
		fc.makeNewLand();
		ArrayList<Land>lands=fc.getEmptyLands();
		int size=lands.size();
		for(int i=0;i<size;i++) {
			fc.sow(1,i);
		}											//sow carrot on 2 lands
		fc.machineReady().setStrategy(new MachineIrrigation());		//use machine to irrigate on all lands
		fc.machineReady().execute();
		fc.machineReady().setStrategy(new MachineHarvest());		//use setStrategy to decide which work to do
		fc.machineReady().execute();								//and execute to do the work
	}
}
