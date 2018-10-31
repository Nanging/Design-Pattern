package machine;

import worker.Worker;

public class WorkAdapter extends Worker{
	public MachineSchedule machineSchedule;
	public WorkAdapter(MachineSchedule machineSchedule) {
		// TODO Auto-generated constructor stub
		this.machineSchedule = machineSchedule;
		type = "ALL";
	}
	@Override
	public void action(int id) {
		// TODO Auto-generated method stub
		machineSchedule.execute();
	}
}
