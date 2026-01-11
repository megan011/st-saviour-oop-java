package oop;

import java.util.ArrayList;

public class Makeuptest {
    public static void main(String[] args) {

        Makeup m1 = new Mascara("SkyHigh", 15.0, true, "black", "thick");
        Makeup m2 = new LipGloss("Rhode", 25.0, "pink", true, true);

        // instanceof (polymorphism)
        System.out.println(m1 instanceof Makeup);     // true
        System.out.println(m1 instanceof EyeProduct); // true
        System.out.println(m2 instanceof LipProduct); // true

        // inherited methods from Makeup
        System.out.println(m1.getBrand());
        System.out.println("Luxury? " + m2.isLuxury());

        // ArrayList<T>
        ArrayList<Makeup> products = new ArrayList<>();
        products.add(m1);
        products.add(m2);

        for (Makeup m : products) {
            System.out.println(m.getBrand() + " costs $" + m.getPrice());
        }

        Shiny s = (Shiny)m2; //LipGloss implements shiny 
        System.out.println("Lipgloss shine effect" + s.shineEffect()); 
        System.out.println("Default shine" + Shiny.defaultShine); 
    }
}

