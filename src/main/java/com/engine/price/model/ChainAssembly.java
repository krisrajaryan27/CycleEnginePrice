package com.engine.price.model;

import java.util.List;
import java.util.Objects;

/**
 * Model Class For Chain Assembly
 *
 * @author Krishna Verma
 */
public class ChainAssembly {
    private String chainType;
    private String pedalType;
    private List<DatedPrice> datedPrice;

    public ChainAssembly(String chainType, String pedalType, List<DatedPrice> datedPrice) {
        this.chainType = chainType;
        this.pedalType = pedalType;
        this.datedPrice = datedPrice;
    }

    public String getChainType() {
        return chainType;
    }

    public void setChainType(String chainType) {
        this.chainType = chainType;
    }

    public String getPedalType() {
        return pedalType;
    }

    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
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
        ChainAssembly that = (ChainAssembly) o;
        return Objects.equals(getChainType(), that.getChainType()) &&
                Objects.equals(getPedalType(), that.getPedalType()) &&
                Objects.equals(getDatedPrice(), that.getDatedPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChainType(), getPedalType(), getDatedPrice());
    }

    @Override
    public String toString() {
        return "ChainAssembly: " +
                "chainType='" + chainType + '\'' +
                ", pedalType='" + pedalType;
    }
}
