package worker;

public class FertilizeCommand extends Command{
	

	public boolean execute(Worker a) {
		if(!a.type.equals("harvest")&&!a.type.equals("irrigate")) {
			a.action(number);
			return true;
		}
		return false;
	}
	
}
