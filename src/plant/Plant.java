package plant;

import thing.PlantState;
import thing.Product;
import thing.Raw;

public abstract class Plant {
	protected PlantState growState=Raw.getInstance(); // ֲ������״̬
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
	 * ����ֲ������Ĳ�ͬ������ʵ�ֲ�ͬ���ջ���
	 * @return ����ֲ���ջ���״̬�����Ƿ����
	 */
	public abstract boolean harvest();
	public void changeState(PlantState state) {
		growState = state;
	}

}
