package pattern;

public interface ISubject {
	public void addObserver(IObserver o);
	public void removeObserver(IObserver o);
	public String getState();
	public void setState(String state);
}
