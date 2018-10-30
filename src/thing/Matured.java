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
		System.out.println("Matured"); 
	}

	@Override
	public void fertilized(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("Already Matured");
	}
	@Override
	public void irrigated(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("Already Matured");
	}
	@Override
	public boolean harvest(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("harvest!");
		return true;
	}

	
//	@Override
//	public void excute() {
//		// TODO Auto-generated method stub
//		
//	}

}
