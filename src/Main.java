import java.util.Vector;

import buy.*;
import livestock.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ʾ����5ͷ��
		Vector<Livestock> fivePigs=new BuyPig().start(5);
		for(int i=0;i<5;i++)
		{
			System.out.print(fivePigs.get(i).getId());
		}
		//ʾ����5������
		new BuySeedOrFeed().addToList(0, 6);
	}

}
