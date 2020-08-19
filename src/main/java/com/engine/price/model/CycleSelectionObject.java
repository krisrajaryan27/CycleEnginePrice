package com.engine.price.model;

import com.engine.price.data.AvailableCycleParts;

import java.util.Map;

/**
 * Cycle Components selection Object used for running producer and consumer.
 *
 * @author Krishna Verma
 */
public class CycleSelectionObject {
    private final AvailableCycleParts availableCycleParts;
    private final Map<String, String> selectionMap;

    public CycleSelectionObject(AvailableCycleParts availableCycleParts, Map<String, String> selectionMap) {
        this.availableCycleParts = availableCycleParts;
        this.selectionMap = selectionMap;
    }

    public AvailableCycleParts getAvailableCycleParts() {
        return availableCycleParts;
    }

    public Map<String, String> getSelectionMap() {
        return selectionMap;
    }

}
