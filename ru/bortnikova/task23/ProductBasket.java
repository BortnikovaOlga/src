package ru.bortnikova.task23;

import java.util.ArrayList;

import java.util.List;

public class ProductBasket implements Basket {
    public static List<Product> listProd;

    ProductBasket() {
        List<Product> lp = new ArrayList<>();
        listProd = lp;
    }

    @Override
    public String toString() {
        return listProd.toString();
    }

    /**
     *
     * @param product Принимает название продукта
     * @return Возвращает индекс нахождения в коллекции или -1 , если отсутствует такой продукт.
     */
    public int indexProduct(String product) {
        for (int i = 0; i < listProd.size(); i++) {
            if (listProd.get(i).getName().compareTo(product) == 0)
                return i;

        }
        return -1;
    }

    @Override
    public void addProduct(String product, int quantity) {
        int i = indexProduct(product);
        if (i < 0) listProd.add(new Product(product, quantity));
        else {
            int n = listProd.get(i).getQuantity();
            listProd.get(i).setQuantity(n + quantity);
        }
    }


    @Override
    public void removeProduct(String product) {
        int i = indexProduct(product);
        if (i >= 0)
            listProd.remove(i);

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int i = indexProduct(product);
        if (i >= 0)
            listProd.get(i).setQuantity(quantity);
    }

    @Override
    public void clear() {
        listProd.clear();

    }

    @Override
    public List<String> getProducts() {
        List<String> ls = new ArrayList<String>(listProd.size());
        for (int i = 0; i < listProd.size(); i++) {
            ls.add(listProd.get(i).getName());
        }
        return ls;
    }

    @Override
    public int getProductQuantity(String product) {
        int i = indexProduct(product);
        return ((i >= 0) ? listProd.get(i).getQuantity() : -1);
    }
}
