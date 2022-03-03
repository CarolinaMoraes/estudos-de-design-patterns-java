package comportamental.observer;

public class TestaObservable {

	public static void main(String[] args) {
		
		WeatherStation station = new WeatherStation();
		station.setTemperature(10);
		
		station.add(new PhoneDisplay(station));
		
		station.setTemperature(25);
		
		// Isso poderia ficar no próprio método setTemperature, mas só pra fins de exemplo vou usar ele aqui
		station.notifyObservers();

		station.setTemperature(32);
		station.notifyObservers();
	}

}
