package yds;

import java.util.Observable;


/**
 * 使用java内置的观察者模式，继承Observable
 * */
public class WeatherData extends Observable {

    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    //观察者数据发生变化会自动调用该方法
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
}
