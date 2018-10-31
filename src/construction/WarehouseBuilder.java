package construction;

public class WarehouseBuilder extends Builder {
	
	private Warehouse warehouse;
	public Warehouse buildWarehouse() {
		createContainter();
		createComponents();
		return warehouse;
	}
	@Override
	public void createContainter() {
		// TODO Auto-generated method stub
		warehouse = new Warehouse();
	}

	@Override
	public void createComponents() {
		// TODO Auto-generated method stub
		
	}

}
