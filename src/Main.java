import java.util.Vector;
import buy.ResList;
import buy.*;
import buy.ResList.s_type;
import livestock.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//初始money数
		System.out.print(ResList.Instance().money+"\n");
		//示例买2头猪
		Vector<Livestock> fivePigs=new BuyPig().start(2);
		for(int i=0;i<2;i++)
		{
			System.out.print(fivePigs.get(i).getId());
		}
		System.out.print("\n"+ResList.Instance().money+"\n");
		//示例买5个种子
		new BuySeedOrFeed().addToList(0, 5);
		System.out.print(ResList.Instance().money+"\n");
	}

}
