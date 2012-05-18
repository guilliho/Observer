package pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectImpl implements ISubject {
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	private String state = "";
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}
	
	public void addObserver(IObserver o) {
		observers.add(o);
	}
	
	public void removeObserver(IObserver o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		Iterator<IObserver> i = observers.iterator();
		while (i.hasNext()) {
			IObserver o = (IObserver) i.next();
			o.update(this);
	    }
	}
}
