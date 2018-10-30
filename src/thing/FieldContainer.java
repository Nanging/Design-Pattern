package thing;
import machine.*;
import java.util.ArrayList;
import plant.Seed;

public class FieldContainer {
	private static FieldContainer instance = null;
	private ArrayList<Land> cultivatedLands; //种植的土地
	private ArrayList<Land> uncultivatedLands; //未种植的土地集合
	private MachineSchedule machine; 	// 田地配置的机器
	/**
	 *  获得就绪的机器
	 */
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
	/**
	 *  开垦一块土地
	 */
	public void makeNewLand() {
		int num = cultivatedLands.size()+uncultivatedLands.size()+1;
		uncultivatedLands.add(new Land(num));
		System.out.println("Land"+num+"created!");
		
	}
	/**
	 * 在已经种植的土地中查找指定土地
	 * @param landID
	 * @return 指定土地
	 */
	private Land getLandFromCultivatedLands(int landID) {
		for (int i = 0; i < cultivatedLands.size(); i++) {
			if (cultivatedLands.get(i).getLandID() == landID) {
				return cultivatedLands.get(i);
			}
		}
		return null;
	}
	/**
	 * 获得指定未种植土地
	 * @param landID
	 * @return 指定土地
	 */
	private Land getLandFromUncultivatedLands(int landID) {
		for (int i = 0; i < uncultivatedLands.size(); i++) {
			if (uncultivatedLands.get(i).getLandID() == landID) {
				return uncultivatedLands.get(i);
			}
		}
		return null;
	}
	/**
	 * 对指定的土地进行播种
	 * @param seed
	 * @param landID
	 */
	public void sow(Seed seed,int landID) {
		Land land = getLandFromUncultivatedLands(landID);
		if (land!=null) {
			land.sow(seed.createItem());
			uncultivatedLands.remove(land);
			cultivatedLands.add(land);
		}
	}
	/**
	 *  清楚指定土地上的作物
	 * @param landID
	 */
	public void remove(int landID) {
		Land land = getLandFromCultivatedLands(landID);
		if (land!=null) {
			land.remove();
			cultivatedLands.remove(land);
			uncultivatedLands.add(land);
		}
	}
	public void fertilize(int landID) {
		Land land = getLandFromCultivatedLands(landID);
		if (land!=null) {
			land.fertilize();
		}
	}
	public void irrigate(int landID) {
		Land land = getLandFromCultivatedLands(landID);
		if (land!=null) {
			land.irrigate();
		}
	}
	public void harvest(int landID) {
		Land land = getLandFromCultivatedLands(landID);
		if (land!=null) {
			land.harvest();
		}
	}


}
