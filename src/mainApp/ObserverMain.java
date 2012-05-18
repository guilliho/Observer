package mainApp;

import static java.lang.System.out;
import pattern.*;

public class ObserverMain {
	public static void main(String[] args){
		
		IObserver one = new ObserverImpl();
		IObserver two = new ObserverImplOther();
		
		ISubject s = new SubjectImpl();
		
		s.addObserver(one);
		s.addObserver(two);
		
		s.setState("New State");
		
		out.println("\nChanging State...\n");
		
		s.setState("Other State");
		
	}
}
