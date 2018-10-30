package thing;
import machine.*;
import java.util.ArrayList;
import plant.Seed;

public class FieldContainer {
	private static FieldContainer instance = null;
	private ArrayList<Land> cultivatedLands; //��ֲ������
	private ArrayList<Land> uncultivatedLands; //δ��ֲ�����ؼ���
	private MachineSchedule machine; 	// ������õĻ���
	/**
	 *  ��þ����Ļ���
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
	 *  ����һ������
	 */
	public void makeNewLand() {
		int num = cultivatedLands.size()+uncultivatedLands.size()+1;
		uncultivatedLands.add(new Land(num));
		System.out.println("Land"+num+"created!");
		
	}
	/**
	 * ���Ѿ���ֲ�������в���ָ������
	 * @param landID
	 * @return ָ������
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
	 * ���ָ��δ��ֲ����
	 * @param landID
	 * @return ָ������
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
	 * ��ָ�������ؽ��в���
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
	 *  ���ָ�������ϵ�����
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
