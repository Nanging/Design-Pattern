package worker;

public class IrrigateCommand extends Command{
	public boolean execute(Worker a) {
		if(a.type=="irrigate") {
			((Irrigateman)a).irrigate(number);
			return true;
		}
		return false;
	}
	
}
