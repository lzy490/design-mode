
/**
 * 饮料抽象类
 * */
public abstract class Beverage {

    protected String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
