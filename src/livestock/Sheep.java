package livestock;

import livestock.Livestock.species;

public class Sheep extends Livestock {
	public Sheep(int id)
	{
		super(id,species.sheep,species.sheep.getPrice());
	}
	public boolean getWool() {
		if(nowstate.getState()==1)
		{
			System.out.println("����ë�ɹ�");
			//�����ë
			
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		else {
			System.out.println("�����ܸ���ë");
			return false;
		}
	}
}
