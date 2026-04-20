package ru.store.online.model;

import ru.store.online.model.enumeration.Aroma;
import ru.store.online.model.enumeration.TeaType;

public class Tea extends Drink {

    private TeaType teaType;

    private Aroma aroma;

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }
}
