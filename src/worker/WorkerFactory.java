package worker;

import machine.MachineSchedule;
import machine.WorkAdapter;

public class WorkerFactory {
	public static Worker createNormalWorker(int type) {
		switch (type) {
		case 1:
			return new Fertilizeman();
		case 2:
			return new Irrigateman();
		case 3:
			return new Harvestman();
		default:
			break;
		}
		return null;
	}
	public static Worker createMachine() {
		return new WorkAdapter(new MachineSchedule());
	}
}
