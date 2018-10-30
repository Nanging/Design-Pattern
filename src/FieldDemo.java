import thing.FieldContainer;

public class FieldDemo {

	public static void main(String[] args) {		//state pattern
		// TODO Auto-generated method stub
		FieldContainer fc = FieldContainer.getInstance();
		System.out.println("-----");
		fc.makeNewLand();
		fc.sow(0, 0);			//the initial state of a new plant is raw
		fc.fertilize(0);		//after fertilization it changes to FertilizedButNotIrrigated
		fc.irrigate(0);			//after fertilization and irrigation, it changes to Matured
		fc.harvest(0);			//when it's matured, it can be harvest, if else not

	}

}
