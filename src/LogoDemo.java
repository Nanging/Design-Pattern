import logo.*;
import java.lang.ref.*;
public class LogoDemo {                  //flyweight pattern
	public static void main(String[] args) {		//Title is a singleton
		Title.getTitleInstance().setStyle(0);		//there're totally 3 styles, so the param should be between 0 and 2
		Title.getTitleInstance().setContent("fly");	//the style is the shared object
		Title.getTitleInstance().printLogo();		//see logo.Title
		Title.getTitleInstance().setStyle(1);
		Title.getTitleInstance().printLogo();
	}
}
