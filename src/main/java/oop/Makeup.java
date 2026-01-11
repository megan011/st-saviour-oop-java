package oop;

public abstract class Makeup {
   public String brand;
   public double price;

   public Makeup(String brand, double price) {
       this.brand = brand;
       this.price = price;
   }

   public void setBrand(String brand){
       this.brand = brand;
   }

   public String getBrand() {
       return this.brand;
   }

   public void setPrice(double price) {
       this.price = price; 
   }

   public double getPrice() {
       return this.price;
   }

  
   public abstract boolean isLuxury();
}
