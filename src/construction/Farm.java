package construction;

public class Farm {
	private static Farm instance;
	private Warehouse ware;
	private Farm() {
		ware=(Warehouse)BuildingFactory.produce("warehouse");
	}
	public static Farm getInstance(){
		if(instance==null) {
			instance=new Farm();
		}
		return instance;
	}
	public Warehouse getWarehouse() {
		return ware;
	}
	
}
