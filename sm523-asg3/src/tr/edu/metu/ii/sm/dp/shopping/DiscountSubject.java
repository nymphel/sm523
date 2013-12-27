package tr.edu.metu.ii.sm.dp.shopping;

import java.util.ArrayList;
import java.util.List;

/** concrete subject */
public class DiscountSubject implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private boolean available;

	@Override
	public void register(Observer obj) {
		observers.add(obj);

	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}

	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if (available) {
			notifyObservers();
		}
	}

}
