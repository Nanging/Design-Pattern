package construction;

public class Farm {
	private static Farm instance;
	private Warehouse ware;
	private Factory factory;
	private Farm() {
		ware=(Warehouse)BuildingFactory.produce("warehouse");
		factory=(Factory)BuildingFactory.produce("factory");
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
	public Factory getFactory() {
		return factory;
	}
}
