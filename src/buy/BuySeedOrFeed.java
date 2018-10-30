package buy;

public class BuySeedOrFeed extends Buy {

	@Override
	public void addToList(int type, int num) {
		ResList reslist = ResList.Instance();
		reslist.s_list[type] += num;
	}

}
