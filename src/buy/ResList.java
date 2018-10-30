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
	};//��������
	public enum s_type{
		seed1(0),seed2(1);
		private int type;
		private s_type(int i){
			this.type = i;
		}
		public int id(){
			return type;
		}
	};//���ӻ���������
	public Vector<Vector<Livestock>> l_list = new Vector<Vector<Livestock>>(10);//�洢��ͬ�������
	public int[] s_list = new int[10];//�洢��ͬ���ӻ���������
	public int money;
	
	private final static ResList r = new ResList();//Singleton ����ģʽ
	private ResList(){};
	public static ResList Instance(){
		return r;
	}
}
