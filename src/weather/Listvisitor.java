package weather;
import java.util.Iterator;
public class Listvisitor extends Visitor {

	@Override
	public void visit(Wstate state) {
		// TODO Auto-generated method stub
		System.out.println(state.getName());
		 Iterator<Wstate> it=state.iterator();
		while(it.hasNext()) 
		{
		 Wstate s=(Wstate)it.next();
		 System.out.println("Listvisitor is visiting  "+s.getName());
		}
	}

}
