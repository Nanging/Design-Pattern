package construction;

import java.util.ArrayList;
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


	@Override
	public void build() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}

	
}