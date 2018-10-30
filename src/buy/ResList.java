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
		seed1(0),seed2(1);
		private int type;
		private s_type(int i){
			this.type = i;
		}
		public int id(){
			return type;
		}
	};//种子或幼苗类型
	public Vector<Vector<Livestock>> l_list = new Vector<Vector<Livestock>>(10);//存储不同牲畜个体
	public int[] s_list = new int[10];//存储不同种子或幼苗数量
	public int money;
	
	private final static ResList r = new ResList();//Singleton 单例模式
	private ResList(){};
	public static ResList Instance(){
		return r;
	}
}
