package thing;
import machine.*;
import java.util.ArrayList;
import plant.Seed;

public class FieldContainer {
	private static FieldContainer instance = null;
	private ArrayList<Land> cultivatedLands;
	private ArrayList<Land> uncultivatedLands;
	private MachineSchedule machine;
	public MachineSchedule machineReady() {
		return machine;
	}
	private FieldContainer() {
		// TODO Auto-generated constructor stub
		cultivatedLands = new ArrayList<>();
		uncultivatedLands = new ArrayList<>();
		machine=new MachineSchedule();
	}
	public static FieldContainer getInstance() {
		if (instance==null) {
			instance = new FieldContainer();
		}
		return instance;
	}
	public ArrayList<Land> getLands(){
		return cultivatedLands;
	}
	public void makeNewLand() {
		int num=cultivatedLands.size()+uncultivatedLands.size()+1;
		cultivatedLands.add(new Land(num));
		System.out.println("Land"+num+"created!");
		
	}
	private Land getLand(int landID) {
		for (int i = 0; i < cultivatedLands.size(); i++) {
			if (cultivatedLands.get(i).getLandID() == landID) {
				return cultivatedLands.get(i);
			}
		}
		return null;
	}
	public boolean sow(Seed seed,int landID) {
		Land land = getLand(landID);
		if (land!=null) {
			land.sow(seed.createItem());
		}
		return false;
	}
	public void remove(int landID) {
		Land land = getLand(landID);
		if (land!=null) {
			land.remove();;
		}
	}
	public void fertilize(int landID) {
		Land land = getLand(landID);
		if (land!=null) {
			land.fertilize();
		}
	}
	public void irrigate(int landID) {
		Land land = getLand(landID);
		if (land!=null) {
			land.irrigate();
		}
	}
	public void harvest(int landID) {
		Land land = getLand(landID);
		if (land!=null) {
			land.harvest();
		}
	}


}
