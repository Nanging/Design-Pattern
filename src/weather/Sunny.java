package weather;

public class Sunny extends Wstate {
private static Sunny _framestate;
public Sunny() {addPrototype(this);Wstate.array.add(this);num++;_id=num;}
private int _id;
private static int _count=1;
protected Sunny(int dummy) {num++;_id=num;}
	@Override
	protected Weather returnType() {
		// TODO Auto-generated method stub
		return Weather.sunny;
	}
	
	protected void finalize() {_count--;};


	@Override
	public Wstate copy() {
		// TODO Auto-generated method stub
		Sunny s=new Sunny(1);
		Wstate.array.add(s);
		return s;
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("It's sunny now!");
	}
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name="sunny";
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
