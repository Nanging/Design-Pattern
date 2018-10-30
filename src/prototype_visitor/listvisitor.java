package prototype_visitor;
import java.util.Iterator;
public class listvisitor extends visitor {

	@Override
	public void visit(wstate state) {
		// TODO Auto-generated method stub
		System.out.println(state.getName());
		 Iterator<wstate> it=state.iterator();
		while(it.hasNext()) 
		{
		 wstate s=(wstate)it.next();
		 System.out.println(s.getName());
		}
	}

}
