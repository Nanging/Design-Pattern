package construction;

public class FactoryBuilder extends Builder{
	private Factory factory;
	public Factory buildFactory() {
		createContainter();
		createComponents();
		return factory;
	}

	@Override
	public void createContainter() {
		// TODO Auto-generated method stub
		factory = new Factory();
	}

	@Override
	public void createComponents() {
		// TODO Auto-generated method stub
		
	}

}
