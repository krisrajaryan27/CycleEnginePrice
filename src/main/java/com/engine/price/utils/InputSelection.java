package com.engine.price.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Creates an input selection object for command line selection processing
 *
 * @author Krishna Verma
 */
public class InputSelection {
    private final Map<String, String> map = new LinkedHashMap<>();

    public Map<String, String> getMap() {
        return map;
    }

}
