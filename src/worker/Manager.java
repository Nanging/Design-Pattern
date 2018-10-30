package worker;

import thing.FieldContainer;

public class Manager {
	private Manager() {}
	private static Manager instance = new Manager();
	public static Manager getInstance() {
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
}
