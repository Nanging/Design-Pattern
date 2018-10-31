package construction;

public class BuildingFactory {
	
	public static BuildingAction produce(String BulidingType) {
		if("factory".equals(BulidingType)) {
			return new FactoryBuilder().buildFactory();
		}else if("warehouse".equals(BulidingType)) {
			return new WarehouseBuilder().buildWarehouse();
		}else if("animalhouse".equals(BulidingType)) {
			
			return new AnimalhouseBuilder().buildAnimalhouse();
		}else {
			System.out.println("Input the correct type!");
			return null;
		}	
	}
	

}
