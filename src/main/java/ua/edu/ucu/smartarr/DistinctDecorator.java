package ua.edu.ucu.smartarr;


import java.util.ArrayList;
import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Object[] res = smartArray.toArray();

        ArrayList<?> list = new ArrayList<>(Arrays.asList(res));
        int i = 0;
        while (i < list.size()) {
            int j = i + 1;
            while (j < list.size()) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                } else {
                    j++;
                }
            }
            i++;
        }
        this.smartArray = new BaseArray(list.toArray());
    }

    @Override
    public String operationDescription() {
        return "Remove duplicates from SmartArray";
    }
}
