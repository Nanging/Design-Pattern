package buy;
import livestock.*;
import java.util.Vector;

public abstract class BuyLivestock extends Buy{
	ResList reslist = ResList.Instance();
	public Vector<Livestock> llist = null;
	
	public void addToList(int type, int num){//��������������б�
		reslist.l_list.get(type).addAll(llist);
	}

	public abstract Livestock create(int id);	//���øú�������������
	public abstract Vector<Livestock> start(int num);//���øú������ָ����������
}
