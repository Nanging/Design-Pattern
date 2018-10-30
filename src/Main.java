import java.util.Vector;

import buy.*;
import livestock.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//示例买5头猪
		Vector<Livestock> fivePigs=new BuyPig().start(5);
		for(int i=0;i<5;i++)
		{
			System.out.print(fivePigs.get(i).getId());
		}
		//示例买5个种子
		new BuySeedOrFeed().addToList(0, 6);
	}

}
