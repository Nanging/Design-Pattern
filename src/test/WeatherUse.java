package test;

import weather.*;
import java.util.Scanner;
import java.util.ArrayList;
public class WeatherUse {
	private Scanner in;
	public WeatherUse(Scanner in)
	{
		this.in = in;
	}
	public void menu()
	{
		boolean loop = true;
		ArrayList<Wstate>state=new ArrayList<Wstate>();
		do
		{
			System.out.println("please select the weather you want:");
			System.out.println("1.Sunny");
			System.out.println("2.Windy");
			System.out.println("3.Rainy");
			System.out.println("4.Get the latest weather information");
			System.out.println("5.exit");
			if (in.hasNextInt()==false) {
				System.out.println("Wrong Input");
				continue;
			}
			int choice = in.nextInt();
			switch(choice)
			{
			case 1:
				state.add(Wstate.findandclone(Weather.sunny));
				System.out.println("It's sunny now");
				break;
			case 2:
				state.add(Wstate.findandclone(Weather.windy));
				System.out.println("It's windy now");
				break;
			case 3:
				state.add(Wstate.findandclone(Weather.rainy));
				System.out.println("It's rainy now");
				break;
			case 4:
				if(state.isEmpty())
					System.out.println("you havn't chosen any weather");
				else
					Wstate.array.get(0).accept(new Listvisitor());
				break;
			case 5:
				loop=false;
				break;
			default:
				System.out.println("Wrong Input");
				break;
			}
		}while(loop);
	}

}
