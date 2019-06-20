package ru.davletbaev.task20.part1.part2;

public class Main {
    public static void main(String[] args) {

        Basket basket = new BasketImpl();
        basket.addProduct("��������", 2);
        basket.addProduct("����", 3);
        basket.addProduct("������", 1);
        basket.addProduct("����", 5);

        System.out.println("������� ������ ���������");
        System.out.println(basket.getProducts());
        System.out.println();

        System.out.println("������� ��������");
        basket.removeProduct("��������");
        System.out.println(basket.getProducts());
        System.out.println();

        System.out.println("�������� ���������� ����");
        basket.updateProductQuantity("����", 150);
        for (String product : basket.getProducts()) {
            if (product.equals("����")) {
                System.out.println(product + " " + basket.getProductQuantity(product));
            }
        }
        System.out.println();

        System.out.println("������� ��� �� �������");
        basket.clear();
        System.out.println(basket.getProducts());
    }

}
