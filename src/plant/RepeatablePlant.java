package plant;


public abstract class RepeatablePlant extends Plant {


	/**
	 *  可多次收获的作物收获后植物仍存在
	 */
	@Override
	public boolean harvest() {
		// TODO Auto-generated method stub
		growState.harvest(this);
		return true;
	}


}
