package worker;

import thing.FieldContainer;

public class FarmMaster {
	private FarmMaster() {}
	private static FarmMaster instance = new FarmMaster();
	public static FarmMaster getInstance() {
		return instance;
	}
	//命令工人去做
	public void call(Command command) {
		WorkerList workerlist = new WorkerList();
		for(Worker worker: workerlist.workList) {
			if(command.execute(worker)) {
				break;
			}
		}
	}
	//施肥
	public void fertilize(int landID) {
		FieldContainer.getInstance().fertilize(landID);
	}
	//灌溉
	public void irrigate(int landID) {
		FieldContainer.getInstance().irrigate(landID);
	}
	//收获
	public void harvest(int landID) {
		FieldContainer.getInstance().harvest(landID);
	}
	
	public void callManager(Command command) {
		Manager.getInstance().call(command);
	}

	public void doFertilizeByManager(int landID) {
		Manager.getInstance().fertilize(landID);
	}

	public void doIrrigateByManager(int landID) {
		Manager.getInstance().irrigate(landID);
	}

	public void doHarvestByManager(int landID) {
		Manager.getInstance().harvest(landID);
	}
}
