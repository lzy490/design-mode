
/**
 * 布告板接口, 实现了观察者接口，继承update方法，用户给主题显式调用。
 * 同时自身定义了display方法，用于展示信息
 * */
public interface DisplayElement extends Observer{

    void display();

}
