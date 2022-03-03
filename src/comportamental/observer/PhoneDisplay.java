package comportamental.observer;

public class PhoneDisplay implements IObserver {

	private WeatherStation weatherStation;
	
	private int temperature;
	
	public PhoneDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		this.temperature = this.weatherStation.getTemperature();
		System.out.println("temperature: " + temperature);
	}

}
