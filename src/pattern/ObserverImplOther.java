package pattern;

import static java.lang.System.out;

public class ObserverImplOther implements IObserver {

	private String state = "";
	
	@Override
	public void update(ISubject o) {
		state = o.getState();
		out.println("ObserverImplOther - Update received from Subject, state changed to : " + state);
	}

}
