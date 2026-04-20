package ru.store.online.model;

import java.math.BigDecimal;

public class CartItem {

  private Drink drink;
  private double count;

  public Drink getDrink() {
    return drink;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public double getCount() {
    return count;
  }

  public void setCount(double count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return drink.getName() + " x " + count + " = " +
        drink.getPrice().multiply(BigDecimal.valueOf(count)) + " руб.";
  }
}