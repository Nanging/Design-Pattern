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
	//�����ȥ��
	public void call(Command command) {
		manager.call(command);
	}
	//ʩ��
	public void fertilize(int landID) {
		FieldContainer.getInstance().fertilize(landID);
	}
	//���
	public void irrigate(int landID) {
		FieldContainer.getInstance().irrigate(landID);
	}
	//�ջ�
	public void harvest(int landID) {
		FieldContainer.getInstance().harvest(landID);
	}
}
