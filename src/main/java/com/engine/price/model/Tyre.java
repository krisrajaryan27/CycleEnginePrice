package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model class for different kinds of Tyres
 *
 * @author Krishna Verma
 */
public class Tyre {
    private String type;
    private List<DatedPrice> datedPrice;

    public Tyre(String type, List<DatedPrice> datedPrice) {
        this.type = type;
        this.datedPrice = datedPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DatedPrice> getDatedPrice() {
        return datedPrice;
    }

    public void setDatedPrice(List<DatedPrice> datedPrice) {
        this.datedPrice = datedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tyre tyre = (Tyre) o;
        return Objects.equals(getType(), tyre.getType()) &&
                Objects.equals(getDatedPrice(), tyre.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "Tyre Type: " + type;
    }
}
