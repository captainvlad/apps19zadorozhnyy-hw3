package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;
import java.util.stream.Stream;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smart, MyFunction myf) {
        super(smart);
        Stream<Object> a = Arrays.stream(smart.toArray());
        array = a.map(myf::apply).toArray();
    }

    @Override
    public String operationDescription() {
        return "Map decorator used. To all elements MyFunction was applied";
    }
}
