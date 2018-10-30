package construction;

import java.util.ArrayList;

import buy.ResList;
import construction.LivestockFarm;

public class Animalhouse implements BuildingAction {
	
	
	private LivestockFarm livsetockFarms;
	

	public Animalhouse() {
		livsetockFarms = new LivestockFarm();
	}
	

	public LivestockFarm buildLivestockFarm() {
		
		System.out.println("The animalhouse have been built!");
		return livsetockFarms;
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