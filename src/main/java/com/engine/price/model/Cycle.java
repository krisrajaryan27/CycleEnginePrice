package com.engine.price.model;


import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static com.engine.price.utils.Constants.INVALID_COMPONENT_SELECTED;

/**
 * Cycle Object Created with different configurable components.
 *
 * @author Krishna Verma
 */
public class Cycle {
    private Frame frame;
    private HandleBar handleBar;
    private Brakes brakes;
    private Gear gear;
    private Wheel wheel;
    private ChainAssembly chainAssembly;
    private Seat seat;
    private double price;
    private Date selectedDate;
    private Map<String, String> individualPriceMap = new LinkedHashMap<>();

    public Cycle() {
    }

    public Cycle(Frame frame, HandleBar handleBar, Brakes brakes, Gear gear, Wheel wheel, ChainAssembly chainAssembly, Seat seat, double price, Date selectedDate) {
        this.frame = frame;
        this.handleBar = handleBar;
        this.brakes = brakes;
        this.gear = gear;
        this.wheel = wheel;
        this.chainAssembly = chainAssembly;
        this.seat = seat;
        this.price = price;
        this.selectedDate = selectedDate;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public HandleBar getHandleBar() {
        return handleBar;
    }

    public void setHandleBar(HandleBar handleBar) {
        this.handleBar = handleBar;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public ChainAssembly getChainAssembly() {
        return chainAssembly;
    }

    public void setChainAssembly(ChainAssembly chainAssembly) {
        this.chainAssembly = chainAssembly;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    public Map<String, String> getIndividualPriceMap() {
        return individualPriceMap;
    }

    public void setIndividualPriceMap(Map<String, String> individualPriceMap) {
        this.individualPriceMap = individualPriceMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cycle cycle = (Cycle) o;
        return Double.compare(cycle.getPrice(), getPrice()) == 0 &&
                Objects.equals(getFrame(), cycle.getFrame()) &&
                Objects.equals(getHandleBar(), cycle.getHandleBar()) &&
                Objects.equals(getBrakes(), cycle.getBrakes()) &&
                Objects.equals(getGear(), cycle.getGear()) &&
                Objects.equals(getWheel(), cycle.getWheel()) &&
                Objects.equals(getChainAssembly(), cycle.getChainAssembly()) &&
                Objects.equals(getSeat(), cycle.getSeat()) &&
                Objects.equals(getSelectedDate(), cycle.getSelectedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrame(), getHandleBar(), getBrakes(), getGear(), getWheel(), getChainAssembly(), getSeat(), getPrice(), getSelectedDate());
    }

    @Override
    public String toString() {
        if (frame == null || wheel == null || handleBar == null || brakes == null || gear == null || chainAssembly == null || seat == null) {
            return INVALID_COMPONENT_SELECTED;
        }
        return "\nCycle Configured is: \n" +
                "frame = " + frame + ",\n" +
                "handleBar = " + handleBar + ",\n" +
                "brakes = " + brakes + ",\n" +
                "gear = " + gear + ",\n" +
                "wheel = " + wheel + ",\n" +
                "tyre = " + wheel.getTyre() + ",\n" +
                "chainAssembly = " + chainAssembly + ",\n" +
                "seat = " + seat + ",\n" +
                "total Cost to manufacture the cycle = " + price;
    }
}
