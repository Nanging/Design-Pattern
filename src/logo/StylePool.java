package logo;
import java.util.*;

public class StylePool {
	private ArrayList<BorderStyle> pool;
	StylePool(){
		pool=new ArrayList<BorderStyle>();
		for (int i=0;i<3;i++) {
			pool.add(null);
		}
		
	}
	BorderStyle getStyle(int i){
		if(i>=pool.size()) {
			return null;
		}
		if(pool.get(i)==null) {
			switch(i) {
			case 0: pool.set(i, new StyleA());break;
			case 1: pool.set(i, new StyleB());break;
			case 2: pool.set(i, new StyleC());break;
			}
		}
		return pool.get(i);
	}
}
