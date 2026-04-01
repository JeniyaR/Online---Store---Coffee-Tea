package ru.store.online.model;

import ru.store.online.model.enumeration.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {


    private LocalDateTime date;

    private User usser;

    private Adress adress;

    private BigDecimal totalPrice;

    private Status status;

    private CartItem[] cartItemArray;


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUsser() {
        return usser;
    }

    public void setUsser(User usser) {
        this.usser = usser;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public CartItem[] getCartItemArray() {
        return cartItemArray;
    }

    public void setCartItemArray(CartItem[] cartItemArray) {
        this.cartItemArray = cartItemArray;
    }
}
