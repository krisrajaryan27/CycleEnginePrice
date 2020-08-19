package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model Class for different kinds of Wheels
 *
 * @author Krishna Verma
 */
public class Wheel {
    private int noOfSpokes;
    private String rimsType;
    private String tubeType;
    private Tyre tyre;
    private List<DatedPrice> datedPrice;

    public Wheel(int noOfSpokes, String rimsType, String tubeType, List<DatedPrice> datedPrice) {
        this.noOfSpokes = noOfSpokes;
        this.rimsType = rimsType;
        this.tubeType = tubeType;
        this.datedPrice = datedPrice;
    }

    public Wheel(Tyre tyre) {
        this.tyre = tyre;
    }

    public int getNoOfSpokes() {
        return noOfSpokes;
    }

    public void setNoOfSpokes(int noOfSpokes) {
        this.noOfSpokes = noOfSpokes;
    }

    public String getRimsType() {
        return rimsType;
    }

    public void setRimsType(String rimsType) {
        this.rimsType = rimsType;
    }

    public String getTubeType() {
        return tubeType;
    }

    public void setTubeType(String tubeType) {
        this.tubeType = tubeType;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
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
        Wheel wheel = (Wheel) o;
        return getNoOfSpokes() == wheel.getNoOfSpokes() &&
                Objects.equals(getRimsType(), wheel.getRimsType()) &&
                Objects.equals(getTubeType(), wheel.getTubeType()) &&
                Objects.equals(getTyre(), wheel.getTyre()) &&
                Objects.equals(getDatedPrice(), wheel.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoOfSpokes(), getRimsType(), getTubeType(), getTyre(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "Wheel Type: " +
                "noOfSpokes = " + noOfSpokes +
                ", rimsType = '" + rimsType + '\'' +
                ", tubeType = '" + tubeType;
    }
}
