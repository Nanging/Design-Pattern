package prototype_visitor;
//workstate��Ϊ�������
import java.util.Vector;
import java.util.Iterator;
abstract class wstate implements acceptor
{
  private static wstate[]_states=new wstate[10];//��Ÿ���state����
  private static int _nextslot=0;
  public static Vector<wstate>array=new Vector<wstate>();
  protected abstract weather returnType();
  protected static void addPrototype(wstate state)
  {
      _states[_nextslot++]=state;
  }
  protected abstract wstate copy();
  public static wstate findandclone(weather s)
  {
	  for(int i=0;i<_nextslot;i++)
		  if(_states[i].returnType()==s)
			  return _states[i].copy();
	if(s==weather.sunny)
		return new sunny();
	else if(s==weather.rainy)
		return new rainy();
	else 
		return new windy();
  }
  public abstract void work();
  public abstract String getName();//ȡ������
  public abstract int getNumber();//ȡ������
  public void accept(visitor v)
  {
	  v.visit(this);
  }
  public Iterator iterator()
  {
	  return array.iterator();
  }
}
