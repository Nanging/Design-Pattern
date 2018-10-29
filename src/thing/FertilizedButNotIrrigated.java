package thing;

import plant.Plant;

public class FertilizedButNotIrrigated implements AbstractPlantGrowState{
	static private FertilizedButNotIrrigated state = null;
	private  FertilizedButNotIrrigated() {
		// TODO Auto-generated constructor stub
	}
	static public FertilizedButNotIrrigated getInstance() {
		if (state == null) {
			state = new FertilizedButNotIrrigated();
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
		System.out.println("������Ҫʩ��");
//		plant.changeState(FertilizedButNotIrrigated.getInstance());
	}

	@Override
	public void irrigated(Plant plant) {
		// TODO Auto-generated method stub
		plant.changeState(RipeState.getInstance());
	}
	@Override
	public boolean harvest(Plant plant) {
		// TODO Auto-generated method stub
		System.out.println("�������ջ�");
		return false;
	}

}
