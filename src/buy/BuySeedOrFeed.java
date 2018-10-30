package buy;

import buy.ResList.s_type;

public class BuySeedOrFeed extends Buy {

	@Override
	public void addToList(int type, int num) {
		ResList reslist = ResList.Instance();
		reslist.s_list[type] += num;
		//switch type{
		
		//}
		//reslist.money-=();
	}

}
