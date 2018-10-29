package thing;

import plant.Plant;

public class PlumuleState implements AbstractPlantGrowState{
	static private PlumuleState state = null;
	private  PlumuleState() {
		// TODO Auto-generated constructor stub
	}
	static public PlumuleState getInstance() {
		if (state == null) {
			state = new PlumuleState();
		}
		return state;
	}
	@Override
	public void showState() {
		// TODO Auto-generated method stub
		
	}
//	static public PlumuleState getInstance() {
//		return new PlumuleState();
//	}
//	@Override
//	public void changeState(Plant plant, int value) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void fertilized(Plant plant) {
		// TODO Auto-generated method stub
		plant.changeState(FertilizedButNotIrrigated.getInstance());
	}
	@Override
	public void irrigated(Plant plant) {
		// TODO Auto-generated method stub
		plant.changeState(IrrigatedButNotFertilizedState.getInstance());
	}
	@Override
	public boolean harvest(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("还不能收获");
		return false;
	}

//	@Override
//	public void excute() {
//		// TODO Auto-generated method stub
//		
//	}



}
