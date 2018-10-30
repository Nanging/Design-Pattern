package worker;

public class HarvestCommand extends Command{
	public boolean execute(Worker a) {
		if(a.type=="harvest") {
			((Harvestman)a).harvest(number);
			return true;
		}
		return false;
	}
}
