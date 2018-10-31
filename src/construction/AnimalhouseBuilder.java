package construction;

public class AnimalhouseBuilder extends Builder{
	private Animalhouse ah;
	public Animalhouse buildAnimalhouse() {
		createContainter();
		createComponents();
		return ah;
	}

	@Override
	public void createContainter() {
		// TODO Auto-generated method stub
		ah =  new Animalhouse();
	}

	@Override
	public void createComponents() {
		// TODO Auto-generated method stub
		ah.add(new LivestockFarm("Chook"));
		ah.add(new LivestockFarm("Cow"));
		ah.add(new LivestockFarm("Ox"));
		ah.add( new LivestockFarm("Pig"));
		ah.add( new LivestockFarm("Sheep"));
	}

}
