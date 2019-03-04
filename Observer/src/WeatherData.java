import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据，只要数据一更新就通知布告板
 * */
public class WeatherData implements Subject {

    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    //当有数据更新时会调用这个方法
    public void measurementsChanged() {
        notifyObserver();
    }
}
