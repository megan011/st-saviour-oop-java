package oop;

public abstract class LipProduct extends Makeup {
    protected String color;
    protected boolean moisturizing;

    public LipProduct(String brand, double price, String color, boolean moisturizing) {
        super(brand, price);
        this.color = color;
        this.moisturizing = moisturizing;
    }

    public boolean isHydrating() {
        return moisturizing;
    }
}

