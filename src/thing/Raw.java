package thing;

import plant.Plant;

public class Raw implements PlantState{
	static private Raw state = null;
	private  Raw() {
		// TODO Auto-generated constructor stub
	}
	static public Raw getInstance() {
		if (state == null) {
			state = new Raw();
		}
		return state;
	}
	@Override
	public void showState() {
		// TODO Auto-generated method stub
		System.out.println("Raw");
		
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
		System.out.println("cannot harvest yet");
		return false;
	}

//	@Override
//	public void excute() {
//		// TODO Auto-generated method stub
//		
//	}



}
