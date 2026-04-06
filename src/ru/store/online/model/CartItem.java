package ru.store.online.model;

public class CartItem {

    private Drink drink;

    private Short count;

  // Лишние строки
    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Short getCount() {
        return count;
    }

    public void setCount(Short count) {
        this.count = count;
    }
}
