package worker;

public class HarvestCommand extends Command{
	public boolean execute(Worker a) {
		if(!a.type.equals("fertilize")&&!a.type.equals("irrigate")) {
			a.action(number);
			return true;
		}
		return false;
	}
}
