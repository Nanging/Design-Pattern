package plant;

import thing.PlantState;
import thing.Product;

public abstract class Plant {
	protected PlantState growState; // 植物生长状态
	public void showPlantState() {
		growState.showState();
	}
	public void fertilized() {
		// TODO Auto-generated method stub
		growState.fertilized(this);
	}

	public void irrigated() {
		// TODO Auto-generated method stub
		growState.irrigated(this);
	}
	public abstract void getProduct();
	/**
	 * 根据植物种类的不同，具体实现不同的收获函数
	 * @return 返回植物收获后的状态，即是否存在
	 */
	public abstract boolean harvest();
	public void changeState(PlantState state) {
		growState = state;
	}

}
