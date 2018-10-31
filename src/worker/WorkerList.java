package worker;

import java.util.ArrayList;
import java.util.List;

import javax.management.InstanceAlreadyExistsException;
public class WorkerList {
	public List <Worker> workList = new ArrayList<Worker>(); 
	private static WorkerList instance; 
	public static WorkerList getInstance() {
		if (instance == null) {
			instance = new WorkerList();
		}
		return instance;
	}
	private WorkerList(){
		//工作人员列表添加
		workList.add(new Harvestman());
		workList.add(new Fertilizeman());
		workList.add(new Irrigateman());
	}
	public boolean remove(Worker worker) {
		return workList.remove(worker);
	}
	public boolean add(Worker worker) {
		return workList.add(worker);
	}
}
