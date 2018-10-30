package buy;
import java.util.Vector;

public class ResList {
	public enum l_type{};//牲畜类型
	public enum s_type{};//种子类型
	public Vector<Vector<LiveStock>> l_list = new Vector<Vector<LiveStock>>(10);//存储不同牲畜个体
	public int[] s_list = new int[10];//存储不同种子数量
	public int money;
	
	private final static ResList r = new ResList();//Singleton 单例模式
	private ResList(){};
	public static ResList Instance(){
		return r;
	}
}
