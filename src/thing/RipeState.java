package thing;

import plant.Plant;

public class RipeState implements AbstractPlantGrowState{
	static private RipeState state = null;
	private  RipeState() {
		// TODO Auto-generated constructor stub
	}
	static public RipeState getInstance() {
		if (state == null) {
			state = new RipeState();
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
		System.out.println("�Ѿ������ջ���");
	}
	@Override
	public void irrigated(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ������ջ���");
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
