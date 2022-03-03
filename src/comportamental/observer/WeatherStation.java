package comportamental.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

	private List<IObserver> observers;
	
	private int temperature;
	
	public WeatherStation() {
		this.observers = new ArrayList<IObserver>();
	}

	@Override
	public void add(IObserver observer) {
		this.observers.add(observer);

	}

	@Override
	public void remove(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(o -> o.update());
	}
	
	public int getTemperature() {
		return this.temperature;
	}
	
	public void setTemperature(int temp) {
		this.temperature = temp;
	}
}
