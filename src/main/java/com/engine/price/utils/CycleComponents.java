package com.engine.price.utils;

import com.engine.price.data.AvailableCycleParts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creates the initial cycle components for different dates.
 *
 * @author Krishna Verma
 */
public class CycleComponents {

    private CycleComponents() {
    }

    public static AvailableCycleParts createInitialCycleComponents() throws ParseException {
        Date initialPricingEndDate = getDateFromString("30/11/2016");
        Date finalPricingStartDate = getDateFromString("01/12/2016");
        return new AvailableCycleParts(initialPricingEndDate, finalPricingStartDate);
    }

    private static Date getDateFromString(String dateStr) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(dateStr);
    }
}
