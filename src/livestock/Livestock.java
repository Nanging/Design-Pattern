package livestock;

import thing.LivestockState;

public abstract class Livestock {
	public LivestockState nowstate=new LivestockState();
	private int id;
	//Species enumeration,includiong prices
	public enum species{
		ox(1000),sheep(500),chook(5),cow(20),pig(300);
		private float price;
		species(float p){
			price =p;
		}
		float getPrice() {
			return price;
		}
	};

	private species spe;
	
	//private int lingDays;
	//private float weight;
	//private int place;
	//Constructor
	public Livestock(int id,species s,float price)
	{
		this.id=id;
		this.spe=s;
		//this.species=species;
	}
	public int getId()
	{
		return id;
	}
	/*public String getSpecies()
	{
		return species;
	}*/
	/*public float getWeight()
	{
		return weight;
	}*/
	/*public int getLingDays()
	{
		return lingDays;
	}*/
	
	
}
