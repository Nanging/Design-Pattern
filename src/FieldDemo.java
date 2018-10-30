import thing.FieldContainer;

public class FieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldContainer fc = FieldContainer.getInstance();
		System.out.println("-----");
		fc.makeNewLand();
		fc.sow(0, 0);
		fc.fertilize(0);
		fc.irrigate(0);
		fc.harvest(0);

	}

}
