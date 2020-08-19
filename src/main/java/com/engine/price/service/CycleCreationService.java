package com.engine.price.service;

import com.engine.price.model.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.engine.price.utils.Constants.*;

/**
 * Creates a cycle as per the configuration selected and calculates the total cost to make that cycle.
 * Also, prints prices for each individual components selected.
 *
 * @author Krishna Verma
 */
public class CycleCreationService {

    private CycleCreationService() {

    }

    public static void createCycle(Map<String, List> availableCyclePartsMap, Map<String, String> inputSelectionMap) throws ParseException {
        Cycle cycle = new Cycle();
        double price = 0.0;
        for (String key : inputSelectionMap.keySet()) {
            List list = availableCyclePartsMap.get(key);
            int index = Integer.parseInt(inputSelectionMap.get(key)) - 1;
            Object object = list.get(index);
            cycle = resolveObject(object, cycle, price);
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Total Cost of Making Cycle of Selected Configuration is : Rs." + cycle.getPrice());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(cycle);
        System.out.println("========================================================");
        System.out.println("Individual Price of High Level components : ");
        Map<String, String> individualPriceMap = cycle.getIndividualPriceMap();
        for (String key : individualPriceMap.keySet()) {
            System.out.println(key + " Price: " + individualPriceMap.get(key));
        }
        System.out.println("==========================================================");
        System.out.println("\n#################################################################################################\n");

    }


    public static Cycle resolveObject(Object object, Cycle cycle, double price) {
        Class<?> clazz = object.getClass();
        Date date;
        if (clazz.equals(Date.class)) {
            date = (Date) object;
            cycle.setSelectedDate(date);
        }
        date = cycle.getSelectedDate();
        price = cycle.getPrice();
        Map<String, String> individualPriceMap = cycle.getIndividualPriceMap();
        double individualPrice;
        if (clazz.equals(Frame.class)) {
            Frame frame = (Frame) object;
            cycle.setFrame(frame);
            individualPrice = getPriceFromDatedPriceObject(frame.getDatedPrice(), date);
            individualPriceMap.put(FRAME, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(Brakes.class)) {
            Brakes brakes = (Brakes) object;
            cycle.setBrakes(brakes);
            individualPrice = getPriceFromDatedPriceObject(brakes.getDatedPrice(), date);
            individualPriceMap.put(BRAKE, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(ChainAssembly.class)) {
            ChainAssembly chainAssembly = (ChainAssembly) object;
            cycle.setChainAssembly(chainAssembly);
            individualPrice = getPriceFromDatedPriceObject(chainAssembly.getDatedPrice(), date);
            individualPriceMap.put(CHAIN_ASSEMBLY, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(Gear.class)) {
            Gear gear = (Gear) object;
            cycle.setGear(gear);
            individualPrice = getPriceFromDatedPriceObject(gear.getDatedPrice(), date);
            individualPriceMap.put(GEAR, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(HandleBar.class)) {
            HandleBar handleBar = (HandleBar) object;
            cycle.setHandleBar(handleBar);
            individualPrice = getPriceFromDatedPriceObject(handleBar.getDatedPrice(), date);
            individualPriceMap.put(HANDLE_BAR, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(Seat.class)) {
            Seat seat = (Seat) object;
            cycle.setSeat(seat);
            individualPrice = getPriceFromDatedPriceObject(seat.getDatedPrice(), date);
            individualPriceMap.put(SEAT, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(Tyre.class)) {
            Tyre tyre = (Tyre) object;
            cycle.setWheel(new Wheel(tyre));
            individualPrice = getPriceFromDatedPriceObject(tyre.getDatedPrice(), date);
            individualPriceMap.put(TYRE, String.valueOf(individualPrice));
            price += individualPrice;
        }
        if (clazz.equals(Wheel.class)) {
            Wheel wheel = (Wheel) object;
            Wheel tyreWheel = cycle.getWheel();
            wheel.setTyre(tyreWheel.getTyre());
            cycle.setWheel(wheel);
            individualPrice = getPriceFromDatedPriceObject(wheel.getDatedPrice(), date);
            individualPriceMap.put(WHEEL, String.valueOf(individualPrice));
            price += individualPrice;
        }
        cycle.setPrice(price);
        cycle.setIndividualPriceMap(individualPriceMap);
        return cycle;
    }

    public static double getPriceFromDatedPriceObject(List<DatedPrice> list, Date date) {
        double individualPrice;
        if (list.get(0).getDate().equals(date)) {
            individualPrice = list.get(0).getPrice();
        } else {
            individualPrice = list.get(1).getPrice();
        }
        return individualPrice;
    }
}
