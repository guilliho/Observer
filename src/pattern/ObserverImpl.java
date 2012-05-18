package pattern;

import static java.lang.System.out;

public class ObserverImpl implements IObserver {
 
	private String state = "";

	public void update(ISubject o) {
	  state = o.getState();
	  out.println("ObserverImpl - Update received from Subject, state changed to : " + state);
	}
}
