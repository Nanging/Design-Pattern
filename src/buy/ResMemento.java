package buy;

import java.util.Vector;

import livestock.Livestock;

public class ResMemento {
	public Vector<Vector<Livestock>> l_list;
	public int[] s_list;
	public float money;
	
	public ResMemento() {
		ResList resList = ResList.Instance();
		l_list = resList.l_list;
		money = resList.money;
		s_list = resList.s_list;
	}

}
