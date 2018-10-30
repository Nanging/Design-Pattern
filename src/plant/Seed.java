package plant;

public class Seed {
	public static Plant createItem(int type) {
		switch(type) {
		case 0:return (new Cabbage());
		case 1:return (new Carrot());
		case 2:return (new AppleTree());
		case 3:return (new PearTree());
		default: return null;
		}
	}
}
