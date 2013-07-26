import java.util.Observable;
import java.util.Observer;
import java.util.Random;

class WeatherData extends Observable {
    private float temperature = 0;

    public static void main(String ... args) {
	WeatherData wd = new WeatherData();
	Display d = new Display();
	wd.addObserver(d);
	Random r = new Random();
	for(int i = 0; i < 100; ++i) wd.setTemperature(r.nextInt(100));
    }

    public float getTemperature() {
	return temperature;
    }

    public void setTemperature(float t) {
	temperature = t;
	setChanged();
	notifyObservers(temperature);
    }
}

class Display implements Observer {
    @Override
    public void update(Observable o, Object arg) {
	float t = (Float) arg;
	System.out.println("The temperature now is " + t);
    }
}