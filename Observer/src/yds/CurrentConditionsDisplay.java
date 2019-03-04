package yds;

import java.util.Observable;
import java.util.Observer;

/**
 * 使用java内置的观察者模式
 * */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private Observable observer;

    public CurrentConditionsDisplay(Observable observer) {
        this.observer = observer;
        observer.addObserver(this);
    }

    //update方法由观察者调用，一旦观察者数据发生变化就调用此方法
    @Override
    public void update(Observable o, Object arg) {

        //这个地方自己去观察者那边拿信息，比较灵活，只需要拿自己感兴趣的数据
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前温度为:" + temperature);
    }
}
