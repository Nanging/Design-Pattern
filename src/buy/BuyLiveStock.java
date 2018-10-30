package buy;
import test.ResList;
import test.LiveStock;

public abstract class BuyLiveStock extends Buy {
	private LiveStock newLiveStock=null;
	private LiveStock[] newLiveStockList=null;
	public int type;

	@Override
	public void addToList(int type, int num) {
		// TODO Auto-generated method stub
		ResList.Instance().l_list.get(type).add(newLiveStock);
	}
	//在create()里面务必指定int type
	public abstract LiveStock create();
	public LiveStock start() {
		if(checkShed()) {
			newLiveStock=create();
			addToList(type, 1);
			return newLiveStock;
		}
		else {
			return null;
		}
	}
	public LiveStock[] start(int num) {
		if(checkShed()) {
			for(int i=0;i<num;i++) {
				newLiveStockList[i]=create();
				addToList(type, 1);
			}
			return newLiveStockList;
		}
		else {
			return null;
		}
	}
	public boolean checkShed() {
		//check farm whether have room or not
		
	}
}
