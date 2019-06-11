package ru.bortnikova.task23;

public class Product  {
    private String name;
    private int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals (Product product) {
        return (name.compareTo(product.getName())==0);
    }

    public String toString(){
        return name+":"+String.valueOf(quantity);
    }
}
