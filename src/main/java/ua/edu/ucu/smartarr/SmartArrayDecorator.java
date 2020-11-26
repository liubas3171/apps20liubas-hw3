package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {
    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    // return array with SmartArray elements
    public Object[] toArray() {
        return smartArray.toArray();
    }

    // return current operation name applied to SmartArray
    public String operationDescription() {
        return "No operations were done";
    }

    // return SmartArray size
    public int size() {
        return smartArray.size();
    }
}
