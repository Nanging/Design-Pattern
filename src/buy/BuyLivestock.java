package buy;
import livestock.*;
import java.util.Vector;

public abstract class BuyLivestock extends Buy{
	ResList reslist = ResList.Instance();
	public Vector<Livestock> llist = null;
	
	public void addToList(int type, int num){//添加新增牲畜至列表
		reslist.l_list.get(type).addAll(llist);
	}

	public abstract Livestock create(int id);	//调用该函数新生成牲畜
	public abstract Vector<Livestock> start(int num);//调用该函数添加指定数量牲畜
}
