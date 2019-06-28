package ru.bortnikova.task23;

import java.util.*;

public class BasketMap implements Basket {
    public Map<String, Integer>
            mapProd;

    BasketMap() {
        Map<String, Integer> mp = new HashMap<String, Integer>();
        mapProd = mp;
    }

    @Override
    public String toString() {
        return mapProd.toString();
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (mapProd.containsKey(product)) {
            int n = mapProd.get(product);
            mapProd.replace(product, quantity + n);
        } else
            mapProd.put(product, quantity);

    }

    @Override
    public void removeProduct(String product) {
        mapProd.remove(product);

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (mapProd.get(product) != null)
            mapProd.replace(product, quantity);

    }

    @Override
    public void clear() {
        mapProd.clear();

    }

    // а вот здесь все равно должен возвращаться лист
    @Override
    public List<String> getProducts() {
        List<String> ls = new ArrayList<String>(mapProd.keySet());
        return ls;
    }

    @Override
    public int getProductQuantity(String product) {
        return mapProd.get(product);
    }
}
