package plant;


public abstract class RepeatablePlant extends Plant {


	/**
	 *  �ɶ���ջ�������ջ��ֲ���Դ���
	 */
	@Override
	public boolean harvest() {
		// TODO Auto-generated method stub
		growState.harvest(this);
		return true;
	}


}
