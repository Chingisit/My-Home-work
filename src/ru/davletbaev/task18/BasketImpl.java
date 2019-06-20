package ru.davletbaev.task18;

import java.util.ArrayList;
import java.util.List;

public class BasketImpl implements Basket {

    private List<Product> products = new ArrayList<>();
    private Product product;

    @Override
    public void addProduct(String product, int quantity) {
        products.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        products.removeIf(p -> p.getProduct().equals(product));
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for(Product prod : products) {
            if (prod.getProduct().equals(product)) {
                prod.setProduct(product);
                prod.setQuantity(quantity);
                return;
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        for(Product prod : products) {
            list.add(prod.getProduct());
        }
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        for(Product prod : products) {
            if (prod.getProduct().equals(product)) {
                return prod.getQuantity();
            }

        }
        return 0;
    }

}
