package buy;
import java.util.Vector;
import livestock.*;
public class ResList {
	public enum l_type{};//��������
	public enum s_type{};//��������
	public Vector<Vector<Livestock>> l_list = new Vector<Vector<Livestock>>(10);//�洢��ͬ�������
	public int[] s_list = new int[10];//�洢��ͬ��������
	public int money;
	
	private final static ResList r = new ResList();//Singleton ����ģʽ
	private ResList(){};
	public static ResList Instance(){
		return r;
	}
}
