package buy;

public class BuySeed extends Buy {

	@Override
	public void addToList(int type, int num) {
		// TODO Auto-generated method stub
		ResList reslist = ResList.Instance();
		reslist.s_list[type] += num;
	}

}
