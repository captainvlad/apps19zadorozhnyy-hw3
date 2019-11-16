package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;
import java.util.stream.Stream;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray smart, MyPredicate pre){
        super(smart);
        Stream<Object> a = Arrays.stream(smart.toArray());
        array = a.filter(pre::test).toArray();
    }

    @Override
    public String operationDescription() {
        return "Filter decorator used, according to my predicate function.";
    }
}
