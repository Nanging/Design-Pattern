package worker;

public abstract class Command {
		abstract public boolean execute(Worker worker);	
		int number;
		public int getnumber() {
			return number;
		}
		public void setnumber(int number) {
			this.number=number;
		}
}
