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
			System.out.println("割羊毛成功");
			//获得羊毛
			
			nowstate.setFeedTime();
			nowstate.setDrinkTime();
			return true;
		}
		else {
			System.out.println("还不能割羊毛");
			return false;
		}
	}
}
