package ru.store.online.model;

import ru.store.online.model.enumeration.Country;
import ru.store.online.model.enumeration.Manufacturer;
import ru.store.online.model.enumeration.Package;


import java.math.BigDecimal;

public abstract class Drink {

    private String name;

    private BigDecimal price;

    private float weight;

    private Manufacturer manufacturer;

    private Country country;

    private Package aPackage;

  // Лишние строки
//геттеры и сеттеры это лишнее
// Лишние строки
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
