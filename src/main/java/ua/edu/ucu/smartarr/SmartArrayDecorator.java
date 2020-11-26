package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    public Object[] toArray() // return array with SmartArray elements
    {
        return smartArray.toArray();
    }

    public String operationDescription() // return current operation name applied to SmartArray
    {
        return "No operations were done";
    }

    public int size() // return SmartArray size
    {
        return smartArray.size();
    }
}
