package buy;


public class BuySeedOrFeed extends Buy {

	@Override
	public void addToList(int type, int num) {
		ResList reslist = ResList.Instance();
		reslist.s_list[type] += num;
		switch (type){
		case 0:	case 1:	case 2:	case 3:
			reslist.money-=num;
			break;
		case 4:
			reslist.money-=2*num;
			break;
		};
		
	}

}
