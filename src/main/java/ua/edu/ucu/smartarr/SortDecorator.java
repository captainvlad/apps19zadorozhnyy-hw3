package ua.edu.ucu.smartarr;
import ua.edu.ucu.functions.MyComparator;
import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smart, MyComparator mycmp) {
        super(smart);
        array = Arrays.stream(this.smartArray.toArray())
                .sorted(mycmp).toArray();
    }

    @Override
    public String operationDescription() {
        return "Sort decorator was used. "
                + "Array is sorted according to the Mycomparator";
    }
}
