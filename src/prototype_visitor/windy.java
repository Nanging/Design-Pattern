package prototype_visitor;

public class windy extends wstate{
	private static int _count=1;
	private int _id;
	public windy() {addPrototype(this);wstate.array.add(this);};
	private static windy _grazestate;

	protected windy(int i) {
		// TODO Auto-generated constructor stub
		_id=_count++;
	}

	@Override
	protected weather returnType() {
		// TODO Auto-generated method stub
		return weather.windy;
	}
	 //protected void finalize() {_count--;};

	@Override
	public wstate copy() {
		// TODO Auto-generated method stub
		windy s=new windy(1);
		wstate.array.add(s);
		return s;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Weather::windy"+_id);
	}

	@Override
	public void accept(visitor v) {
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
