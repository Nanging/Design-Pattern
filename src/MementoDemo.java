import buy.*;
public class MementoDemo {
	public static void main(String[] args) {
		ResList resList = ResList.Instance();
		
		//amount of money at first
		System.out.print("You have "+ resList.money + " at first.\n\n");
		//create and store the memento
		ResMemento memento=resList.createMemento();
		//buy a cow to change the state of reslist
		new BuyCow().start(1);
		//use memento to set state
		resList.setStateFromMemento(memento);
		//amount of money after recovering
		System.out.print("\nNow you have "+ resList.money + " again.\n\n");
	}
}
