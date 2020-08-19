package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model Class for Different kinds of seats
 *
 * @author Krishna Verma
 */
public class Seat {
    private String seatType;
    private List<DatedPrice> datedPrice;

    public Seat(String seatType, List<DatedPrice> datedPrice) {
        this.seatType = seatType;
        this.datedPrice = datedPrice;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
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
        Seat seat = (Seat) o;
        return Objects.equals(getSeatType(), seat.getSeatType()) &&
                Objects.equals(getDatedPrice(), seat.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeatType(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "Seat Type :" + seatType;
    }
}
