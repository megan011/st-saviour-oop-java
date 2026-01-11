package oop;

public class LipGloss extends LipProduct implements Shiny{
    private boolean tinted;

    public LipGloss(String brand, double price, String color, boolean moisturizing, boolean tinted) {
        super(brand, price, color, moisturizing);
        this.tinted = tinted;
    }

    public String glossEffect() {
        if (tinted) {
            return "Adds glossy shine with a hint of color.";
        }
        return "Adds clear glossy shine.";
    }

    public boolean isLuxury() {
        return price > 25.0;
    }
    
    public String shineEffect() {
        return glossEffect();
    }
}
