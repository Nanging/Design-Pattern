package plant;

public abstract class DisposablePlant extends Plant {
	
	@Override
	public boolean harvest() {
		// TODO Auto-generated method stub
		if(growState.harvest(this)) {

			return false;
		}
		return true;
	}
}
