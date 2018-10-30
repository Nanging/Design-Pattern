package weather;

import java.util.ArrayList;
public class Run {
public static void main(String[]args)
{
	ArrayList<Weather>input=new ArrayList<Weather>();
	input.add(Weather.sunny);
	input.add(Weather.rainy);
	input.add(Weather.windy);
	input.add(Weather.sunny);
	input.add(Weather.rainy);
	input.add(Weather.windy);
	input.add(Weather.windy);
	input.add(Weather.sunny);
	input.add(Weather.rainy);
	int num_states=input.size();
	Wstate[]state=new Wstate[num_states];
	for(int i=0;i<num_states;i++)
		state[i]=Wstate.findandclone(input.get(i));
	for(int i=0;i<num_states;i++)
		state[i].work();	
	Wstate.array.get(0).accept(new Listvisitor());
}
}
