package prototype_visitor;

public class sunny extends wstate {
private static sunny _framestate;
public sunny() {addPrototype(this);wstate.array.add(this);}
private int _id;
private static int _count=1;
protected sunny(int dummy) {_id=_count++;}
	@Override
	protected weather returnType() {
		// TODO Auto-generated method stub
		return weather.sunny;
	}
	
	protected void finalize() {_count--;};


	@Override
	public wstate copy() {
		// TODO Auto-generated method stub
		sunny s=new sunny(1);
		wstate.array.add(s);
		return s;
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Weather::sunny"+_id);
	}
	@Override
	public void accept(visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name="Weather::sunny"+_id;
		return name;
	}
	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return _count;
	}

}
