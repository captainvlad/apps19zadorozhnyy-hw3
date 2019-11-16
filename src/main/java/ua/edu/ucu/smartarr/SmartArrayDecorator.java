package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;
    protected Object[] array;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
