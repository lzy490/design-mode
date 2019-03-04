import yds.CurrentConditionsDisplay;
import yds.WeatherData;

public class Test {

    //策略模式测试类
    @org.junit.Test
    public void strategyTesst() {
        Duck duck = new RedHeadDuck();
        FlyBehavior flyBehavior = new FlyNoWing();
        duck.setFlyBehavior(flyBehavior);
        duck.display();
        duck.performFly();
    }

    //观察者模式测试类
    @org.junit.Test
    public void observerTest() {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        weatherData.setTemperature(50.6f);
        weatherData.measurementsChanged();
    }

    //装饰者模式
    @org.junit.Test
    public void decoratorTest() {
        //点一杯加了摩卡的焦炒咖啡
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);

        System.out.println("点的饮料为: " + darkRoast.getDescription() + ", 价格为: " + darkRoast.cost());
    }
}
