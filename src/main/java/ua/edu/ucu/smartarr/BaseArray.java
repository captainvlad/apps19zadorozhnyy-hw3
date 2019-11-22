package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    Object[] array;

    public BaseArray(Object[] arg){
        this.array = arg.clone();
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }

    @Override
    public String operationDescription() {
        return "No decorator used ";
    }

    @Override
    public int size() {
        return array.length;
    }


    public void setValue(int index) {
        array[index] = 0;
    }
}
