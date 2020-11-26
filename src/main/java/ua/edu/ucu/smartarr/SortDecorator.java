package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        Object[] res = smartArray.toArray();
        Arrays.sort(res, comparator);
        this.smartArray = new BaseArray(res);
    }


    @Override
    public String operationDescription() {
        return "Sorts elements using MyComparator to compare them";
    }


}
