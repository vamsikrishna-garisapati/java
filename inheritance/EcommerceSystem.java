package com.inheritance;

class Products{
    int productId;
    String productionName;
    int price;

    public Products(int productId, String productionName, int price) {
        this.productId = productId;
        this.productionName = productionName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("id: " + productId);
        System.out.println("Name: " + productionName);
        System.out.println("price: " + price);
    }
}

class Electronics extends Products{
    double warrantyPeriod;

    public Electronics(int productId, String productionName, int price, double warrantyPeriod) {
        super(productId, productionName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty Period: " + warrantyPeriod);
    }
}

class Clothing extends Products{
    int size;

    public Clothing(int productId, String productionName, int price, int size) {
        super(productId, productionName, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        Electronics e = new Electronics(1, "Oppo", 345, 2.5);
        e.displayInfo();

        Clothing c = new Clothing(2, "Nylon", 256, 32);
        c.displayInfo();
    }
}