package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.stream.Stream;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Stream<Object> a = Arrays.stream(smartArray.toArray());
        array = a.distinct().toArray();
        }

    @Override
    public String operationDescription() {
        return "Distinct decorator used. "
                + "Duplicates from SmartArray removed.";
    }
}
