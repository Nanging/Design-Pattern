package buy;

public class BuySeedOrFeed extends Buy {

	@Override
	public void addToList(int type, int num) {
		ResList reslist = ResList.Instance();
		reslist.s_list[type] += num;
		String typeName = "";
		switch (type) {
		case 0:
			typeName = "CabbageSeed";
			reslist.money -= num;
			break;
		case 1:
			typeName = "carrot seed";
			reslist.money -= num;
			break;
		case 2:
			typeName = "apple seed";
			reslist.money -= num;
			break;
		case 3:
			typeName = "pear seed";
			reslist.money -= num;
			break;
		case 4:
			typeName = "feed";
			reslist.money -= 2 * num;
			break;
		}
		;
		System.out.print("You have bought " + num + " unit(s) of " + typeName + " successfully. You still have гд"
				+ reslist.money + " left.\n\n");
	}

}
