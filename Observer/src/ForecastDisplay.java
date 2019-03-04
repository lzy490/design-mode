/**
 * 显示天气预报布告板
 *
 * */
public class ForecastDisplay implements DisplayElement {

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("显示天气预报布告板");
    }

    @Override
    public void update() {
        System.out.println("更新天气预报布告板");
        display();
    }
}
