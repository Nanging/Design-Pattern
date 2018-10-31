package worker;

import machine.MachineFertilization;
import machine.MachineHarvest;
import machine.MachineIrrigation;
import machine.MachineSchedule;
import machine.WorkAdapter;

public class SuperManager extends Manager {
	private static Manager instance;
	private SuperManager(Manager manager) {
		// TODO Auto-generated constructor stub
		instance = manager;
	}
	public static SuperManager getInstance(Manager manager) {
		
		return new SuperManager(manager);
	}
	@Override
	public void call(Command command) {
		WorkerList workerlist = WorkerList.getInstance();
		WorkAdapter workAdapter = new WorkAdapter(new MachineSchedule());
		workAdapter.machineSchedule.setStrategy(new MachineIrrigation());
		WorkAdapter workAdapter2 = new WorkAdapter(new MachineSchedule());
		workAdapter.machineSchedule.setStrategy(new MachineFertilization());
		WorkAdapter workAdapter3 = new WorkAdapter(new MachineSchedule());
		workAdapter.machineSchedule.setStrategy(new MachineHarvest());
		workerlist.add(workAdapter);
		workerlist.add(workAdapter2);
		workerlist.add(workAdapter3);
		instance.call(command);
		workerlist.remove(workAdapter);
		workerlist.remove(workAdapter2);
		workerlist.remove(workAdapter3);
		
	}
}
