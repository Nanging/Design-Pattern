import java.util.Vector;
import buy.ResList;
import buy.*;
import buy.ResList.s_type;
import livestock.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ʼmoney��
		System.out.print(ResList.Instance().money+"\n");
		//ʾ����2ͷ��
		Vector<Livestock> fivePigs=new BuyPig().start(2);
		for(int i=0;i<2;i++)
		{
			System.out.print(fivePigs.get(i).getId());
		}
		System.out.print("\n"+ResList.Instance().money+"\n");
		//ʾ����5������
		new BuySeedOrFeed().addToList(0, 5);
		System.out.print(ResList.Instance().money+"\n");
	}

}
