package thing;

import plant.Plant;

public class Matured implements PlantState{
	static private Matured state = null;
	private  Matured() {
		// TODO Auto-generated constructor stub
	}
	static public Matured getInstance() {
		if (state == null) {
			state = new Matured();
		}
		return state;
	}
	@Override
	public void showState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fertilized(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("已经可以收获了");
	}
	@Override
	public void irrigated(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("已经可以收获了");
	}
	@Override
	public boolean harvest(Plant plant) {
		// TODO Auto-generated method stub
		return true;
	}

	
//	@Override
//	public void excute() {
//		// TODO Auto-generated method stub
//		
//	}

}
