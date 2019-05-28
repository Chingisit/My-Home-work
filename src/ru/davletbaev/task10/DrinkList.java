package ru.davletbaev.task10;

public enum DrinkList {
    FRESH_APLLE(1, "Яблочный фрэш", 100),
    PEPSI(2, "Пепеси", 50),
    COCA_COLA(3, "Кока кола", 60),
    BLACK_TEA(4, "Чай черный", 30),
    GREEN_TEA(5, "Чай зеленый", 35),
    COFFE_LATE(6, "Кофе Лате", 70),
    COFFE_AMERICANO(7, "Кофе Американо", 50),
    HOT_CHOKOLATE(8, "Горячий шоколад", 80),
    WATHER(9, "Вода", 20),
    ERROR(0, "Товар не найден!", 0);

    private int code;
    private String desc;
    private int price;

    DrinkList(int code, String desc, int price) {
        this.code = code;
        this.desc = desc;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(" %s за %d руб. ", desc, price, code );
    }
}
