package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray inputArray, MyComparator myCmp) {
        super(inputArray);
        Object[] newArr = smartArray.toArray();

        Arrays.sort(newArr, myCmp);

        this.smartArray = new BaseArray(newArr);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray().clone();
    }

    @Override
    public String operationDescription() {
        return "Sorts array using MyComparator";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
