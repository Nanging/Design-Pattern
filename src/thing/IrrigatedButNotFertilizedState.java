package thing;

import plant.Plant;

public class IrrigatedButNotFertilizedState implements PlantState{
	static private IrrigatedButNotFertilizedState state = null;
	private  IrrigatedButNotFertilizedState() {
		// TODO Auto-generated constructor stub
	}
	static public IrrigatedButNotFertilizedState getInstance() {
		if (state == null) {
			state = new IrrigatedButNotFertilizedState();
		}
		return state;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showState() {
		// TODO Auto-generated method stub
		System.out.println("Irrigated But Not Fertilized"); 
	}

	@Override
	public void fertilized(Plant plant) {
		// TODO Auto-generated method stub
		plant.changeState(Matured.getInstance());
	}

	@Override
	public void irrigated(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("no need for irrigation");
//		plant.changeState(FertilizedButNotIrrigated.getInstance());
	}
	@Override
	public boolean harvest(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("cannot harvest yet");
		return false;
	}

}
