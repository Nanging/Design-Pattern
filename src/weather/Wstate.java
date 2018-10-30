package weather;
//workstate��Ϊ�������
import java.util.Vector;
import java.util.Iterator;
abstract class Wstate implements Acceptor
{
  private static Wstate[]_states=new Wstate[10];//��Ÿ���state����
  private static int _nextslot=0;
  public static Vector<Wstate>array=new Vector<Wstate>();
  protected abstract Weather returnType();
  protected static void addPrototype(Wstate state)
  {
      _states[_nextslot++]=state;
  }
  protected abstract Wstate copy();
  public static Wstate findandclone(Weather s)
  {
	  for(int i=0;i<_nextslot;i++)
		  if(_states[i].returnType()==s)
			  return _states[i].copy();
	if(s==Weather.sunny)
		return new Sunny();
	else if(s==Weather.rainy)
		return new Rainy();
	else 
		return new Windy();
  }
  public abstract void work();
  public abstract String getName();//ȡ������
  public abstract int getNumber();//ȡ������
  public void accept(Visitor v)
  {
	  v.visit(this);
  }
  public Iterator iterator()
  {
	  return array.iterator();
  }
}
