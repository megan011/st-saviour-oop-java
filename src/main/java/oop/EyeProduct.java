package oop;

public abstract class EyeProduct extends Makeup {
    protected boolean waterResistant;
    protected String finish;

    public EyeProduct(String brand, double price, boolean waterResistant, String finish) {
        super(brand, price);
        this.waterResistant = waterResistant;
        this.finish = finish;
    }

    public String eyeEffect() {
        return "Creates a " + finish + " eye look.";
    }
}

