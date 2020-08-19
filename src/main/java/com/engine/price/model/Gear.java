package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model Class for different kinds of Gears
 *
 * @author Krishna Verma
 */
public class Gear {
    private int noOfGears;
    private List<DatedPrice> datedPrice;

    public Gear(int noOfGears, List<DatedPrice> datedPrice) {
        this.noOfGears = noOfGears;
        this.datedPrice = datedPrice;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
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
        Gear gear = (Gear) o;
        return getNoOfGears() == gear.getNoOfGears() &&
                Objects.equals(getDatedPrice(), gear.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoOfGears(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "Gear Type: noOfGears = " + noOfGears;
    }
}
