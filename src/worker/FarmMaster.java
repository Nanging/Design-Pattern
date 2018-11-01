package worker;

import thing.FieldContainer;

public class FarmMaster {
	private FarmMaster() {}
	private static FarmMaster instance = new FarmMaster();
	private Manager manager = new Manager();
	public static FarmMaster getInstance() {
		return instance;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	//命令工人去做
	public void call(Command command) {
		manager.call(command);
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
