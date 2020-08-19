package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model Class for Brakes
 *
 * @author Krishna Verma
 */
public class Brakes {

    private String type;
    private List<DatedPrice> datedPrice;

    public Brakes(String type, List<DatedPrice> datedPrice) {
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
        Brakes brakes = (Brakes) o;
        return Objects.equals(getType(), brakes.getType()) &&
                Objects.equals(getDatedPrice(), brakes.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "Brake Type: " + type;
    }
}
