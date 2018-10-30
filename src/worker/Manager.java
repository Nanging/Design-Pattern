package worker;

import thing.FieldContainer;

public class Manager {
	private Manager() {}
	private static Manager instance = new Manager();
	public static Manager getInstance() {
		return instance;
	}
	
	//�����ȥ��
	public void call(Command command) {
		WorkerList workerlist = new WorkerList();
		for(Worker worker: workerlist.workList) {
			if(command.execute(worker)) {
				break;
			}
		}
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
