package construction;


import java.util.ArrayList;

import livestock.Livestock;

public class LivestockFarm implements BuildingAction{
	private ArrayList<Livestock> livestocks = new ArrayList<>();
	public String name;
	public LivestockFarm(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void addLivestock(Livestock newLivestock) {
		livestocks.add(newLivestock);
	}
	class Iterator{
		public boolean hasNext() {
			return livestocks.iterator().hasNext();
		}
		public Livestock next() {
			return livestocks.iterator().next();
		}
	}
	public Livestock getLivestock(int id) {
		Livestock ls = null;
		for (Livestock livestock : livestocks) {
			if (ls.getId() == id) {
				ls = livestock;
			}
		}
		return ls;
	}
	@Override
	public void build() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}
}
