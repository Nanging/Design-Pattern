package buy;
import java.util.Vector;
import livestock.*;

public class ResList {
	public enum l_type{
		ox(0),sheep(1),chook(2),cow(3),pig(4);
		private int type;
		private l_type(int i){
			this.type = i;
		}
		public int id(){
			return type;
		}
	};//牲畜类型
	public enum s_type{
		CabbageSeed(0,1),CarrotSeed(1,1),AppleSeed(2,1),PearSeed(3,1),feed(4,2);
		private int type;
		private float price;
		private s_type(int type,float price){
			this.type = type;
			this.price=price;
		}
		public int id(){
			return type;
		}
		public float price(){
			return price;
		}
	};//种子幼苗类型或饲料
	public Vector<Vector<Livestock>> l_list = new Vector<Vector<Livestock>>(10);//存储不同牲畜个体
	public int[] s_list = new int[10];//存储不同种子幼苗或饲料数量
	public float money=1000;
	
	private final static ResList r = new ResList();//Singleton 单例模式
	private ResList(){
		for(int i = 0; i < 6; i++){
			Vector<Livestock> l = new Vector<Livestock>();
			l_list.addElement(l);
		}
	};
	public static ResList Instance(){
		return r;
	}
}
