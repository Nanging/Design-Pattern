package Livestock;

import Livestock.livestock.species;

public class sheep extends livestock {
	public sheep(int id)
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
