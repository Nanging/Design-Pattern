package weather;

public class Rainy extends Wstate{
	private int _id;
	private static int _count=1;
	private static Rainy _freestate;
	public Rainy() {addPrototype(this);Wstate.array.add(this);};

	protected Rainy(int i) {
		// TODO Auto-generated constructor stub
		_id=_count++;
	}

	@Override
	protected Weather returnType() {
		// TODO Auto-generated method stub
		return Weather.rainy;
	}
	
	 //protected void finalize() {_count--;};

	@Override
	public Wstate copy() {
		// TODO Auto-generated method stub
		Rainy s=new Rainy(1);
		Wstate.array.add(s);
		return s;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Weather::rainy"+_id);
	}

	@Override
	public void accept(Visitor v) {
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
