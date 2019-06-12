package ru.bortnikova.task23;

import java.util.List;

public class BasketApp {
    public static void main(String[] args) {
        Basket pb=new ProductBasket();
        pb.addProduct("кока-кола",1);
        pb.addProduct("чипсы",2);
        System.out.println(pb.toString());
        pb.clear();

        pb.addProduct("молоко",2);
        pb.addProduct("хлеб",1);
        pb.addProduct("геркулес",1);
        System.out.println(pb.toString());

        pb.removeProduct("хлеб");
        System.out.println(pb.toString());

        pb.updateProductQuantity("молоко",3);// изменяем количество
        pb.addProduct("геркулес",1); // добовляем уже существующий в корзине

        System.out.printf(" %d %d ",pb.getProductQuantity("молоко"),pb.getProductQuantity("геркулес"));
        List <String> ls=pb.getProducts();
        System.out.printf(ls.toString());
    }
}
