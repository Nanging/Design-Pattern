package buy;
import livestock.*;
import java.util.Vector;

public abstract class BuyLivestock extends Buy{
	ResList reslist = ResList.Instance();
	public Vector<Livestock> llist = new Vector<Livestock>();
	
	public void addToList(int type, int num){//添加新增牲畜至列表
		reslist.l_list.get(type).addAll(llist);
		switch (type){
			case 0:
				reslist.money -= 1000*num;
				break;			
			case 1:
				reslist.money -= 500*num;
				break;
			case 2:	
				reslist.money -= 5*num;
				break;				
			case 3:
				reslist.money -= 20*num;
				break;
			case 4:
				reslist.money -= 300*num;
				break;
		};
	}

	public abstract Livestock create(int id);	//调用该函数新生成牲畜
	public abstract Vector<Livestock> start(int num);//调用该函数添加指定数量牲畜
}
