package weather;

public class Windy extends Wstate{
	private static int _count=1;
	private int _id;
	public Windy() {addPrototype(this);Wstate.array.add(this);};
	private static Windy _grazestate;

	protected Windy(int i) {
		// TODO Auto-generated constructor stub
		_id=_count++;
	}

	@Override
	protected Weather returnType() {
		// TODO Auto-generated method stub
		return Weather.windy;
	}
	 //protected void finalize() {_count--;};

	@Override
	public Wstate copy() {
		// TODO Auto-generated method stub
		Windy s=new Windy(1);
		Wstate.array.add(s);
		return s;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Weather::windy"+_id);
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name="Weather::windy"+_id;
		return name;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return _count;
	}

}