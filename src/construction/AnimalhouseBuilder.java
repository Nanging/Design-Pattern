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
		ah.livsetockFarmChook = new LivestockFarm("Chook");
		ah.livsetockFarmCow = new LivestockFarm("Cow");
		ah.livsetockFarmOx = new LivestockFarm("Ox");
		ah.livsetockFarmPig = new LivestockFarm("Pig");
		ah.livsetockFarmSheep = new LivestockFarm("Sheep");
	}

}
