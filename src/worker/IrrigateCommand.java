package worker;

public class IrrigateCommand extends Command{
	public boolean execute(Worker a) {
		if(!a.type.equals("fertilize")&&!a.type.equals("harvest")) {
			a.action(number);
			return true;
		}
		return false;
	}
	
}
