package buy;
import java.util.Vector;

public class ResList {
	public enum l_type{};//��������
	public enum s_type{};//��������
	public Vector<Vector<LiveStock>> l_list = new Vector<Vector<LiveStock>>(10);//�洢��ͬ�������
	public int[] s_list = new int[10];//�洢��ͬ��������
	public int money;
	
	private final static ResList r = new ResList();//Singleton ����ģʽ
	private ResList(){};
	public static ResList Instance(){
		return r;
	}
}
