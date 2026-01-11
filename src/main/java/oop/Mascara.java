package oop;

public class Mascara extends EyeProduct {
    private String brushType;

    public Mascara(String brand, double price, boolean waterResistant, String finish, String brushType) {
        super(brand, price, waterResistant, finish);
        this.brushType = brushType;
    }

    public String volumeEffect() {
        return "Adds volume using a " + brushType + " brush.";
    }

    public boolean isLuxury() {
        return price > 15.0;
    }
}
