package machine;

public class MachineSchedule {
	private MachineWork strategy;
	public void execute() {
		strategy.doWork();
	}
	public void setStrategy(MachineWork stg) {
		strategy=stg;
	}
	public MachineSchedule() {
		strategy=(MachineWork)new MachineIrrigation();
	}
}
