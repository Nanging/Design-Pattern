package prototype_visitor;

public class rainy extends wstate{
	private int _id;
	private static int _count=1;
	private static rainy _freestate;
	public rainy() {addPrototype(this);wstate.array.add(this);};

	protected rainy(int i) {
		// TODO Auto-generated constructor stub
		_id=_count++;
	}

	@Override
	protected weather returnType() {
		// TODO Auto-generated method stub
		return weather.rainy;
	}
	
	 //protected void finalize() {_count--;};

	@Override
	public wstate copy() {
		// TODO Auto-generated method stub
		rainy s=new rainy(1);
		wstate.array.add(s);
		return s;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Weather::rainy"+_id);
	}

	@Override
	public void accept(visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name="Weather::rainy"+_id;
		return name;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return _count;
	}

}
