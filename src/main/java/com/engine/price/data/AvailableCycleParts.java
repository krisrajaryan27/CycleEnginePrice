package com.engine.price.data;

import com.engine.price.model.*;

import java.util.*;

import static com.engine.price.utils.Constants.*;

/**
 * Initialises the available cycle parts
 *
 * @author Krishna Verma
 */
public class AvailableCycleParts {
    private final Date initialPricingEndDate;

    private final Date finalPricingStartDate;

    private final Map<String, List> availableCyclePartsMap = new LinkedHashMap<>();

    public Map<String, List> getAvailableCyclePartsMap() {
        return availableCyclePartsMap;
    }

    public AvailableCycleParts(Date initialPricingEndDate, Date finalPricingStartDate) {
        this.initialPricingEndDate = initialPricingEndDate;
        this.finalPricingStartDate = finalPricingStartDate;
        this.availableCyclePartsMap.put(DATE, getDate());
        this.availableCyclePartsMap.put(FRAME, getListOfAvailableFrames());
        this.availableCyclePartsMap.put(BRAKE, getListOfAvailableBrakes());
        this.availableCyclePartsMap.put(CHAIN_ASSEMBLY, getListOfAvailableChainAssemblies());
        this.availableCyclePartsMap.put(GEAR, getListOfAvailableGears());
        this.availableCyclePartsMap.put(HANDLE_BAR, getListOfAvailableHandleBars());
        this.availableCyclePartsMap.put(SEAT, getListOfAvailableSeats());
        this.availableCyclePartsMap.put(TYRE, getListOfAvailableTyres());
        this.availableCyclePartsMap.put(WHEEL, getListOfAvailableWheels());
    }


    //List of available frames
    public List<Frame> getListOfAvailableFrames() {
        List<Frame> availableFrames = new ArrayList<>();
        Frame aluminium = new Frame("Aluminium", Arrays.asList(new DatedPrice(initialPricingEndDate, 1000.0), new DatedPrice(finalPricingStartDate, 1200.00)));
        Frame carbonFiber = new Frame("Carbon Fiber", Arrays.asList(new DatedPrice(initialPricingEndDate, 1200.0), new DatedPrice(finalPricingStartDate, 1500.00)));
        Frame titanium = new Frame("Titanium", Arrays.asList(new DatedPrice(initialPricingEndDate, 1500.0), new DatedPrice(finalPricingStartDate, 1800.00)));
        Frame steel = new Frame("Steel", Arrays.asList(new DatedPrice(initialPricingEndDate, 800.0), new DatedPrice(finalPricingStartDate, 1000.00)));
        availableFrames.add(aluminium);
        availableFrames.add(carbonFiber);
        availableFrames.add(titanium);
        availableFrames.add(steel);
        return availableFrames;
    }

    //List of available brakes
    public List<Brakes> getListOfAvailableBrakes() {
        List<Brakes> availableBrakes = new ArrayList<>();
        Brakes rimBrakes = new Brakes("Rim Brakes", Arrays.asList(new DatedPrice(initialPricingEndDate, 500.0), new DatedPrice(finalPricingStartDate, 700.00)));
        Brakes vBrakes = new Brakes("V Brakes", Arrays.asList(new DatedPrice(initialPricingEndDate, 300.0), new DatedPrice(finalPricingStartDate, 500.00)));
        Brakes discBrakes = new Brakes("Disc Brakes", Arrays.asList(new DatedPrice(initialPricingEndDate, 1000.0), new DatedPrice(finalPricingStartDate, 1200.00)));
        Brakes drumBrakes = new Brakes("Drum Brakes", Arrays.asList(new DatedPrice(initialPricingEndDate, 700.0), new DatedPrice(finalPricingStartDate, 900.00)));
        Brakes coasterBrakes = new Brakes("Coaster Brakes", Arrays.asList(new DatedPrice(initialPricingEndDate, 400.0), new DatedPrice(finalPricingStartDate, 600.00)));
        availableBrakes.add(rimBrakes);
        availableBrakes.add(vBrakes);
        availableBrakes.add(discBrakes);
        availableBrakes.add(drumBrakes);
        availableBrakes.add(coasterBrakes);
        return availableBrakes;
    }

    //List of available chainAssemblies
    public List<ChainAssembly> getListOfAvailableChainAssemblies() {
        List<ChainAssembly> chainAssembliesAvailable = new ArrayList<>();
        ChainAssembly mtbChains = new ChainAssembly("MTB/Road Chains", "Free Wheel Cranks", Arrays.asList(new DatedPrice(initialPricingEndDate, 500.0), new DatedPrice(finalPricingStartDate, 700.00)));
        ChainAssembly bmxChains = new ChainAssembly("BMX Chains", "Tubular Steel Cranks", Arrays.asList(new DatedPrice(initialPricingEndDate, 300.0), new DatedPrice(finalPricingStartDate, 500.00)));
        chainAssembliesAvailable.add(mtbChains);
        chainAssembliesAvailable.add(bmxChains);
        return chainAssembliesAvailable;
    }

    //List of available Gears
    public List<Gear> getListOfAvailableGears() {
        List<Gear> listOfAvailableGears = new ArrayList<>();
        Gear fourGears = new Gear(4, Arrays.asList(new DatedPrice(initialPricingEndDate, 1500.0), new DatedPrice(finalPricingStartDate, 1700.00)));
        Gear sixGears = new Gear(6, Arrays.asList(new DatedPrice(initialPricingEndDate, 1800.0), new DatedPrice(finalPricingStartDate, 2000.00)));
        Gear eightGears = new Gear(8, Arrays.asList(new DatedPrice(initialPricingEndDate, 2200.0), new DatedPrice(finalPricingStartDate, 2400.00)));
        Gear twelveGears = new Gear(12, Arrays.asList(new DatedPrice(initialPricingEndDate, 2800.0), new DatedPrice(finalPricingStartDate, 3000.00)));
        Gear sixteenGears = new Gear(16, Arrays.asList(new DatedPrice(initialPricingEndDate, 3800.0), new DatedPrice(finalPricingStartDate, 4000.00)));
        listOfAvailableGears.add(fourGears);
        listOfAvailableGears.add(sixGears);
        listOfAvailableGears.add(eightGears);
        listOfAvailableGears.add(twelveGears);
        listOfAvailableGears.add(sixteenGears);
        return listOfAvailableGears;
    }

    //List of available handle bars
    public List<HandleBar> getListOfAvailableHandleBars() {
        List<HandleBar> availableHandleBars = new ArrayList<>();
        HandleBar flatBar = new HandleBar("Flat Bar", Arrays.asList(new DatedPrice(initialPricingEndDate, 1000.0), new DatedPrice(finalPricingStartDate, 1200.00)));
        HandleBar riserBar = new HandleBar("Riser Bar", Arrays.asList(new DatedPrice(initialPricingEndDate, 1200.0), new DatedPrice(finalPricingStartDate, 1400.00)));
        HandleBar bullHorn = new HandleBar("Bull Horn", Arrays.asList(new DatedPrice(initialPricingEndDate, 1400.0), new DatedPrice(finalPricingStartDate, 1600.00)));
        HandleBar dropBar = new HandleBar("Drop Bar", Arrays.asList(new DatedPrice(initialPricingEndDate, 1600.0), new DatedPrice(finalPricingStartDate, 1800.00)));
        HandleBar aeroBar = new HandleBar("Aero Bar", Arrays.asList(new DatedPrice(initialPricingEndDate, 1800.0), new DatedPrice(finalPricingStartDate, 2000.00)));
        HandleBar cruiserBar = new HandleBar("Cruiser Bar", Arrays.asList(new DatedPrice(initialPricingEndDate, 2000.0), new DatedPrice(finalPricingStartDate, 2200.00)));
        HandleBar butterflyBar = new HandleBar("ButterFly Bar", Arrays.asList(new DatedPrice(initialPricingEndDate, 2200.0), new DatedPrice(finalPricingStartDate, 2400.00)));
        availableHandleBars.add(flatBar);
        availableHandleBars.add(riserBar);
        availableHandleBars.add(bullHorn);
        availableHandleBars.add(dropBar);
        availableHandleBars.add(aeroBar);
        availableHandleBars.add(cruiserBar);
        availableHandleBars.add(butterflyBar);
        return availableHandleBars;
    }

    //List of available seats
    public List<Seat> getListOfAvailableSeats() {
        List<Seat> listOfAvailableSeats = new ArrayList<>();
        Seat racingSaddle = new Seat("Racing Saddle", Arrays.asList(new DatedPrice(initialPricingEndDate, 500.0), new DatedPrice(finalPricingStartDate, 700.00)));
        Seat comfortSaddle = new Seat("Comfort Saddle", Arrays.asList(new DatedPrice(initialPricingEndDate, 800.0), new DatedPrice(finalPricingStartDate, 1000.00)));
        Seat cruiserSaddle = new Seat("Cruiser Saddler", Arrays.asList(new DatedPrice(initialPricingEndDate, 1000.0), new DatedPrice(finalPricingStartDate, 1200.00)));
        listOfAvailableSeats.add(racingSaddle);
        listOfAvailableSeats.add(comfortSaddle);
        listOfAvailableSeats.add(cruiserSaddle);
        return listOfAvailableSeats;
    }

    //List of available tyres
    public List<Tyre> getListOfAvailableTyres() {
        List<Tyre> listOfAvailableTyres = new ArrayList<>();
        Tyre standardStreet = new Tyre("Standard Street", Arrays.asList(new DatedPrice(initialPricingEndDate, 2000.0), new DatedPrice(finalPricingStartDate, 2200.00)));
        Tyre streetSport = new Tyre("Street Sport", Arrays.asList(new DatedPrice(initialPricingEndDate, 2200.0), new DatedPrice(finalPricingStartDate, 2400.00)));
        Tyre superSport = new Tyre("Super Sport", Arrays.asList(new DatedPrice(initialPricingEndDate, 2400.0), new DatedPrice(finalPricingStartDate, 2600.00)));
        Tyre allTerrain = new Tyre("All Terrain", Arrays.asList(new DatedPrice(initialPricingEndDate, 2600.0), new DatedPrice(finalPricingStartDate, 2800.00)));
        Tyre offRoad = new Tyre("Off Road", Arrays.asList(new DatedPrice(initialPricingEndDate, 2800.0), new DatedPrice(finalPricingStartDate, 3000.00)));
        Tyre racingSlick = new Tyre("Racing Slick", Arrays.asList(new DatedPrice(initialPricingEndDate, 3000.0), new DatedPrice(finalPricingStartDate, 3200.00)));
        listOfAvailableTyres.add(standardStreet);
        listOfAvailableTyres.add(standardStreet);
        listOfAvailableTyres.add(streetSport);
        listOfAvailableTyres.add(superSport);
        listOfAvailableTyres.add(allTerrain);
        listOfAvailableTyres.add(offRoad);
        listOfAvailableTyres.add(racingSlick);
        return listOfAvailableTyres;
    }

    //List of available wheels
    public List<Wheel> getListOfAvailableWheels() {
        List<Wheel> listOfAvailableWheels = new ArrayList<>();
        Wheel shallowSectionTube = new Wheel(48, "Shallow Section", TUBULAR, Arrays.asList(new DatedPrice(initialPricingEndDate, 2000.0), new DatedPrice(finalPricingStartDate, 2200.00)));
        Wheel shallowSectionTubeLess = new Wheel(48, "Shallow Section", TUBELESS, Arrays.asList(new DatedPrice(initialPricingEndDate, 2000.0), new DatedPrice(finalPricingStartDate, 2200.00)));
        Wheel midSectionTube = new Wheel(48, "Mid Section", TUBULAR, Arrays.asList(new DatedPrice(initialPricingEndDate, 2200.0), new DatedPrice(finalPricingStartDate, 2400.00)));
        Wheel midSectionTubeLess = new Wheel(48, "Mid Section", TUBELESS, Arrays.asList(new DatedPrice(initialPricingEndDate, 2200.0), new DatedPrice(finalPricingStartDate, 2400.00)));
        Wheel deepSectionTube = new Wheel(48, "Deep Section", TUBULAR, Arrays.asList(new DatedPrice(initialPricingEndDate, 2400.0), new DatedPrice(finalPricingStartDate, 2600.00)));
        Wheel deepSectionTubeLess = new Wheel(48, "Deep Section", TUBELESS, Arrays.asList(new DatedPrice(initialPricingEndDate, 2400.0), new DatedPrice(finalPricingStartDate, 2600.00)));
        Wheel aluminiumBrakingTube = new Wheel(48, "Aluminium Braking Surface", TUBULAR, Arrays.asList(new DatedPrice(initialPricingEndDate, 2600.0), new DatedPrice(finalPricingStartDate, 2800.00)));
        Wheel aluminiumBrakingTubeLess = new Wheel(48, "Aluminium Braking Surface", TUBELESS, Arrays.asList(new DatedPrice(initialPricingEndDate, 2600.0), new DatedPrice(finalPricingStartDate, 2800.00)));
        Wheel carbonBrakingTube = new Wheel(48, "Carbon Braking surface", TUBULAR, Arrays.asList(new DatedPrice(initialPricingEndDate, 2800.0), new DatedPrice(finalPricingStartDate, 3000.00)));
        Wheel carbonBrakingTubeLess = new Wheel(48, "Carbon Braking surface", TUBELESS, Arrays.asList(new DatedPrice(initialPricingEndDate, 2800.0), new DatedPrice(finalPricingStartDate, 3000.00)));
        listOfAvailableWheels.add(shallowSectionTube);
        listOfAvailableWheels.add(shallowSectionTubeLess);
        listOfAvailableWheels.add(midSectionTube);
        listOfAvailableWheels.add(midSectionTubeLess);
        listOfAvailableWheels.add(deepSectionTube);
        listOfAvailableWheels.add(deepSectionTubeLess);
        listOfAvailableWheels.add(aluminiumBrakingTube);
        listOfAvailableWheels.add(aluminiumBrakingTubeLess);
        listOfAvailableWheels.add(carbonBrakingTube);
        listOfAvailableWheels.add(carbonBrakingTubeLess);
        return listOfAvailableWheels;
    }

    public List<Date> getDate() {
        List<Date> date = new ArrayList<>();
        date.add(initialPricingEndDate);
        date.add(finalPricingStartDate);
        return date;
    }
}
