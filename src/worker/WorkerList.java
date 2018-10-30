package worker;
import java.util.ArrayList;
import java.util.List;
public class WorkerList {
	public List <Worker> workList = new ArrayList<Worker>(); 
	public WorkerList(){
		//工作人员列表添加
		workList.add(new Harvestman());
		workList.add(new Fertilizeman());
		workList.add(new Irrigateman());
	}
	
}
