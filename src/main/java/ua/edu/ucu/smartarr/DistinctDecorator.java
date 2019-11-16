package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Set<Object> h = new HashSet<>
                (Arrays.asList(smartArray.toArray()));
        array = h.toArray();
        }

    @Override
    public String operationDescription() {
        return "Distinct decorator used. "
                + "Duplicates from SmartArray removed.";
    }
}
