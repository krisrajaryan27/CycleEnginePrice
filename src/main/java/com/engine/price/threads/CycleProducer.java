package com.engine.price.threads;

import com.engine.price.data.AvailableCycleParts;
import com.engine.price.model.CycleSelectionObject;
import com.engine.price.utils.CycleComponents;

import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Creates a producer class to produce the selectionObject for different configurations.
 *
 * @author Krishna Verma
 */
public class CycleProducer implements Runnable {
    private final BlockingQueue<CycleSelectionObject> queue;

    public CycleProducer(BlockingQueue<CycleSelectionObject> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            AvailableCycleParts availableCycleParts;
            try {
                availableCycleParts = CycleComponents.createInitialCycleComponents();
                Map<String, List> availableCyclePartsMap = availableCycleParts.getAvailableCyclePartsMap();
                for (int i = 0; i < 1000; i++) {
                    Map<String, String> map = new LinkedHashMap<>();
                    for (String key : availableCyclePartsMap.keySet()) {
                        List list = availableCyclePartsMap.get(key);
                        int count = (i % list.size()) + 1;
                        if (count <= list.size()) {
                            map.put(key, String.valueOf(count));
                            count++;
                        } else {
                            count = 1;
                            map.put(key, String.valueOf(count));
                        }
                    }

                    CycleSelectionObject cycleSelectionObject = new CycleSelectionObject(availableCycleParts, map);
                    queue.put(cycleSelectionObject);
                    Thread.sleep(500);
                }
                //adding exit object
                CycleSelectionObject csc = new CycleSelectionObject(null, null);
                try {
                    queue.put(csc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting the Cycle Producer");
    }
}
