package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model Class for different kinds of Handle Bars
 *
 * @author Krishna Verma
 */
public class HandleBar {
    private String type;
    private List<DatedPrice> datedPrice;

    public HandleBar(String type, List<DatedPrice> datedPrice) {
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
        HandleBar handleBar = (HandleBar) o;
        return Objects.equals(getType(), handleBar.getType()) &&
                Objects.equals(getDatedPrice(), handleBar.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "HandleBar Type: " + type;
    }
}
