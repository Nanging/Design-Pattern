package construction;

public class AnimalhouseBuilder {

	public Animalhouse buildAnimalhouse() {
		Animalhouse ah =  new Animalhouse();
		ah.livsetockFarmChook = new LivestockFarm("Chook");
		ah.livsetockFarmCow = new LivestockFarm("Cow");
		ah.livsetockFarmOx = new LivestockFarm("Ox");
		ah.livsetockFarmPig = new LivestockFarm("Pig");
		ah.livsetockFarmSheep = new LivestockFarm("Sheep");
		return ah;
	}

}
