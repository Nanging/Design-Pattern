package construction;

public class BuildingFactory {
	
	public BuildingAction produce(String BulidingType) {
		if("factory".equals(BulidingType)) {
			return new Factory();
		}else if("warehouse".equals(BulidingType)) {
			return new Warehouse();
		}else if("animalhouse".equals(BulidingType)) {
			return new Animalhouse();
		}else {
			System.out.println("Input the correct type!");
			return null;
		}	
	}
	

}
