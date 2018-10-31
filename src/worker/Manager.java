package worker;



public class Manager {
	protected Manager() {}
	private static Manager instance = new Manager();
	public static Manager getInstance() {
		return instance;
	}
	
	//�����ȥ��
	public void call(Command command) {
		WorkerList workerlist = WorkerList.getInstance();
		for(Worker worker: workerlist.workList) {
			if(command.execute(worker)) {
				break;
			}
		}
	}
	
	public SuperManager LevelUp() {
		return SuperManager.getInstance(this);
	}
}
