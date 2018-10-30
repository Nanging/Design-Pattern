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
		CabbageSeed(0),CarrotSeed(1),AppleSeed(2),PearSeed(3),feed(4);
		private int type;
		private s_type(int i){
			this.type = i;
		}
		public int id(){
			return type;
		}
	};//种子幼苗类型或饲料
	public Vector<Vector<Livestock>> l_list = new Vector<Vector<Livestock>>(10);//存储不同牲畜个体
	public int[] s_list = new int[10];//存储不同种子幼苗或饲料数量
	public int money;
	
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
