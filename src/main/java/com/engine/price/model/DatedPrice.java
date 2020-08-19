package com.engine.price.model;

import java.util.Date;
import java.util.Objects;

/**
 * Model Class for Price Variation as per Date
 *
 * @author Krishna Verma
 */
public class DatedPrice {
    private Date date;
    private double price;

    public DatedPrice(Date date, double price) {
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatedPrice that = (DatedPrice) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 &&
                Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getPrice());
    }

    @Override
    public String toString() {
        return "DatedPrice{" +
                "date=" + date +
                ", price=" + price +
                '}';
    }
}
