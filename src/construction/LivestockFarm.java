package construction;

import java.util.ArrayList;

public class LivestockFarm {

	private static LivestockFarm instance = null;
	

	private ArrayList<BuildingAction> LivsetockFarmPig;
	private ArrayList<BuildingAction> LivsetockFarmCow;
	private ArrayList<BuildingAction> LivsetockFarmOx;
	private ArrayList<BuildingAction> LivsetockFarmChook;
	private ArrayList<BuildingAction> LivsetockFarmSheep;
	LivestockFarm() {
		
		LivsetockFarmPig = new ArrayList<>();
		LivsetockFarmCow = new ArrayList<>();
		LivsetockFarmOx = new ArrayList<>();
		LivsetockFarmChook = new ArrayList<>();
		LivsetockFarmSheep = new ArrayList<>();
		
	}
	public static LivestockFarm getInstance() {
		if (instance==null) {
			instance = new LivestockFarm();
		}
		return instance;
	}
	public ArrayList getLivsetockFarmPig() {
		return LivsetockFarmPig;
	}
	public ArrayList getLivsetockFarmCow() {
		return LivsetockFarmCow;
	}
	public ArrayList getLivsetockFarmOx() {
		return LivsetockFarmOx;
	}
	public ArrayList getLivsetockFarmChook() {
		return LivsetockFarmChook;
	}
	public ArrayList getLivsetockFarmSheep() {
		return LivsetockFarmSheep;
	}
}
