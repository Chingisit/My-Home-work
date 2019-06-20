package ru.davletbaev.task20.part1.part2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class BasketImpl implements Basket {

    private Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        products.replace(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        // 1 способ
        return products.keySet().stream().collect(toList());

        // 2 способ
        //return new ArrayList<>(products.keySet());

        // 3 способ
        /*
        return products
                .entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        */
    }

    @Override
    public int getProductQuantity(String product) {
        return products.get(product);
    }

}
