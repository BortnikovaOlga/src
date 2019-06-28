package ru.bortnikova.task23;

import java.util.List;

// интерфейс задан в ДЗ, реализован в ProductBasket

interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}