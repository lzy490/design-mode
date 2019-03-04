/*
*
* 显示当前观测值的布告板
*
* */
public class CurrentConditionsDisplay implements DisplayElement {

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前观测值");
    }

    @Override
    public void update() {
        System.out.println("更新当前观测值布告板");
        display();
    }
}
