package ru.davletbaev.task5;

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
   // private String desc;
    private int price;

    DrinkList(int code, String desc, int price) {
        this.code = code;
       // this.desc = desc;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    //public static String getDesc() {
      //  return desc;
    //}

    public int getPrice() {
        return price;
    }

    public DrinkList of(int code) {
        for (DrinkList list : values()) {
            if (list.code == code) {
                return list;
            }

        }
        return null;
    }
}
