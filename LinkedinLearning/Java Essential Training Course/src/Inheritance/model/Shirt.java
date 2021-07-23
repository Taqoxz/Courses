package Inheritance.model;

public class Shirt extends ClothingItem{
    private String pattern;

    public Shirt(){
        super();
        this.pattern="Not Set";
    }

    @Override
    public double getPrice() {
        return 22.95;
    }

    public Shirt(String size, double price,String pattern) {
        super("Shirt", size, price);
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return super.toString()+
                " {Shirt attributes: pattern='" + pattern + '\'' +
                '}';
    }
}
