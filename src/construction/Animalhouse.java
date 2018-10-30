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
	
	
//	private LivestockFarm livsetockFarms;
	public LivestockFarm livsetockFarmPig;
	public LivestockFarm livsetockFarmCow;
	public LivestockFarm livsetockFarmOx;
	public LivestockFarm livsetockFarmChook;
	public LivestockFarm livsetockFarmSheep;

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


	public void repair() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}

	
}