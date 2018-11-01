package weather;

public class Rainy extends Wstate{
	private int _id;
	private static int _count=1;
	private static Rainy _freestate;
	public Rainy() {addPrototype(this);Wstate.array.add(this);num++;_id=num;};

	protected Rainy(int i) {
		// TODO Auto-generated constructor stub
		num++;_id=num;
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
		System.out.println("It's rainy now!");
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name="rainy";
		return name;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return _count;
	}

	@Override
	public int returnid() {
		// TODO Auto-generated method stub
		return _id;
	}

}
