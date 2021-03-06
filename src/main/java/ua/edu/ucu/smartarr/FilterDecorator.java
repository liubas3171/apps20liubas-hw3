package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        Object[] res = smartArray.toArray();
        ArrayList<Object> newRes = new ArrayList<>();

        for (Object element : res) {
            if (predicate.test(element)) {
                newRes.add(element);
            }
        }
        this.smartArray = new BaseArray(newRes.toArray());
    }

    @Override
    public String operationDescription() {
        return "Filters elements by MyPredicate";
    }

}
