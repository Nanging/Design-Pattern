package prototype_visitor;

import java.util.ArrayList;
public class run {
public static void main(String[]args)
{
	ArrayList<weather>input=new ArrayList<weather>();
	input.add(weather.sunny);
	input.add(weather.rainy);
	input.add(weather.windy);
	input.add(weather.sunny);
	input.add(weather.rainy);
	input.add(weather.windy);
	input.add(weather.windy);
	input.add(weather.sunny);
	input.add(weather.rainy);
	int num_states=input.size();
	wstate[]state=new wstate[num_states];
	for(int i=0;i<num_states;i++)
		state[i]=wstate.findandclone(input.get(i));
	for(int i=0;i<num_states;i++)
		state[i].work();	
	wstate.array.get(0).accept(new listvisitor());
}
}
