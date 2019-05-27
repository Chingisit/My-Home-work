package ru.davletbaev.task9;

public enum Food {
    APPLE ("Яблоко", 1 ),
    CARROT ("Морковь", 2),
    PORRIDGE ("Каша", 3);

    private String name;
    private int code;


    Food(String name, int code) {

        this.name = name;
        this.code = code;

    }

    @Override
    public String toString() {
        return String.format("%s %d", name, code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
