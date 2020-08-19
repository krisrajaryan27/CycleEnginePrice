package com.engine.price;

import com.engine.price.data.AvailableCycleParts;
import com.engine.price.exception.PriceEngineException;
import com.engine.price.model.CycleSelectionObject;
import com.engine.price.service.CycleCreationService;
import com.engine.price.threads.CycleConsumer;
import com.engine.price.threads.CycleProducer;
import com.engine.price.utils.CycleComponents;
import com.engine.price.utils.InputSelection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static com.engine.price.utils.Constants.*;

/**
 * Main Class to run cycle price engine.
 *
 * @author Krishna Verma
 */
public class CyclePriceMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Cycle Engine Configuration Company!");
        BufferedReader bufferedReader = null;
        InputSelection inputSelection = new InputSelection();
        try {
            switch (args.length) {
                case 0: //Execute Command Line Argument
                    bufferedReader = getBufferedReader();
                    processCommandLineArguments(bufferedReader, inputSelection.getMap());
                    break;
                case 1: //Execute automatically for 1000 cycles
                    processMultipleCycleAutomatically();
                    break;
                default:
                    System.out.println(INVALID_ARGUMENTS);
            }

        } catch (PriceEngineException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Method to handle the processing for command line arguments
    private static boolean processCommandLineArguments(BufferedReader bufferedReader, Map<String, String> map) throws PriceEngineException {
        String input;
        try {
            AvailableCycleParts availableCycleParts = CycleComponents.createInitialCycleComponents();
            Map<String, List> availableCyclePartsMap = availableCycleParts.getAvailableCyclePartsMap();
            for (String key : availableCyclePartsMap.keySet()) {
                List list = availableCyclePartsMap.get(key);
                System.out.println("Enter your selection number for the Item " + key + "...");
                printListOfObject(list);
                input = bufferedReader.readLine().trim();
                if (input.length() > 0) {
                    if (Integer.parseInt(input) > list.size()) {
                        System.out.println(INVALID_REQUEST + ". Please enter the selection till size " + list.size());
                        input = bufferedReader.readLine().trim();
                    }
                } else {
                    System.out.println(INVALID_REQUEST + ". Please enter the selection till size " + list.size());
                    input = bufferedReader.readLine().trim();
                }
                if (validateInput(map, input, key)) return true;
            }
            CycleCreationService.createCycle(availableCyclePartsMap, map);
        } catch (IOException e) {
            throw new PriceEngineException(INVALID_REQUEST, e);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    //Method to process multiple cycles automatically
    private static void processMultipleCycleAutomatically() {
        BlockingQueue<CycleSelectionObject> blockingQueue = new ArrayBlockingQueue<>(1000);
        CycleProducer producer = new CycleProducer(blockingQueue);
        CycleConsumer consumer = new CycleConsumer(blockingQueue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");

    }

    //Method to validate the input
    private static boolean validateInput(Map<String, String> map, String input, String key) throws ParseException, PriceEngineException {
        if (input.equalsIgnoreCase(EXIT)) {
            return true;
        } else {
            resolveInput(input, map, key);
        }
        return false;
    }

    //Method to resolve the input
    private static void resolveInput(String input, Map<String, String> map, String key) {
        map.put(key, input);
    }

    //Method to get the BufferedReader Object from InputStream
    private static BufferedReader getBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    //Prints the List of Objects
    private static void printListOfObject(List list) {
        list.forEach(System.out::println);
    }


}
