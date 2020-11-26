package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        Object[] res = smartArray.toArray();
        for (int i = 0; i < res.length; i++) {
            res[i] = func.apply(res[i]);
        }
        this.smartArray = new BaseArray(res);
    }

    @Override
    public String operationDescription() {
        return "Map every element to another object using MyFunction";
    }

}
