
/**
 * 调味品装饰者， 用来装饰饮料。
 * 必须继承饮料超类，因为装饰者必须能替代被装饰者（饮料加上调料之后，本质上还是饮料）
 *
 * */
public abstract class CondimentDecorator extends Beverage {

    //子类需要重写getDescription方法，为了防止获取更多描述信息。
    @Override
    public abstract String getDescription();
}
