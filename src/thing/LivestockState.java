package thing;

import livestock.Livestock;
import buy.ReList;
public class LivestockState {
	
	private int DrinkTime=0;
	private int FeedTime=0;
	private int sta=0;
	/*enum state{
		young(0),mayure(1),death(2);
		private int sta;
		state(int s){
			sta=s;
		}
		int getState() {
			return sta;
		}
	}*/
	public void setDrinkTime() {
		DrinkTime=2;
		sta=0;
	}
	public void setFeedTime() {
		FeedTime=2;
		sta=0;
	}
	public int getState() {
		return this.sta;
	}
	//ÒûË®
	public void setState(int i) {
		this.sta=i;
	}
	public void Drink() {	
		this.DrinkTime++;
		if(this.getState()==0&&this.DrinkTime>=3&&this.FeedTime>=3)
		{
			this.sta=1;
		}
	}
	//Î¹Ê³
	public void Feed() {
		ReList.Instance().s_list[ReList.Instance().s_type.feed.id()]--;
		this.FeedTime++;
		if(this.getState()==0&&this.DrinkTime>=3&&this.FeedTime>=3)
		{
			this.sta=1;
		}
	}
	public void died() {
		sta=2;
	}
	
}
