package com.engine.price.threads;

import com.engine.price.model.CycleSelectionObject;
import com.engine.price.service.CycleCreationService;

import java.text.ParseException;
import java.util.concurrent.BlockingQueue;

/**
 * Creates a consumer class to consume the selectionObject produced by the cycle producer.
 *
 * @author Krishna Verma
 */
public class CycleConsumer implements Runnable {
    private final BlockingQueue<CycleSelectionObject> queue;

    public CycleConsumer(BlockingQueue<CycleSelectionObject> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            CycleSelectionObject cycleSelectionObject;
            while ((cycleSelectionObject = queue.take()).getSelectionMap() != null) {
                CycleCreationService.createCycle(cycleSelectionObject.getAvailableCycleParts().getAvailableCyclePartsMap(), cycleSelectionObject.getSelectionMap());
                Thread.sleep(10);
            }
        } catch (InterruptedException | ParseException e) {
            e.printStackTrace();
        }

    }
}
