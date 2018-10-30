package thing;
import construction.*;
//Mediate
public class Carrier {
	private Product item;
	public Carrier(Product p) {
		item= p;
	}
	public void carryToWareHouse() {
		Farm.getInstance().getWarehouse().store(item);
	}
}
