package livestock;

import thing.LivestockState;

public abstract class Livestock {
	protected LivestockState nowstate;
	private int id;
	//����ö�٣������۸�
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
	//ö�ٱ���
	private species spe;
	
	//private int lingDays;
	//private float weight;
	//private int place;
	//���캯��
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
