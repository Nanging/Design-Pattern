package construction;

import java.util.ArrayList;

import buy.ResList;
import construction.LivestockFarm;
import livestock.Chook;
import livestock.Cow;
import livestock.Ox;
import livestock.Pig;
import livestock.Sheep;

public class Animalhouse implements BuildingAction {
	

	private ArrayList<LivestockFarm> livestockFarms;
	public Animalhouse() {

	}

	public void build() {
		ResList resList=ResList.Instance();
		if(resList.money<150) {
			System.out.println("Your money is not enough");
			return;
		}
		else {
			resList.money=resList.money-150;
		}
		System.out.println("The factory have been built!");
	}

	public boolean add(LivestockFarm livestockFarm) {
		return livestockFarms.add(livestockFarm);
	}	
	public boolean remove(LivestockFarm livestockFarm) {
		return livestockFarms.remove(livestockFarm);
	}
	public LivestockFarm getLivestockFarm(String name) {
		LivestockFarm live= null;
		for (LivestockFarm livestockFarm : livestockFarms) {
			if (name.equals(livestockFarm.getName())) {
				live = livestockFarm;
			}
		}
		return live;
	}
	public void repair() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}

	
}