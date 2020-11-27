package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);

        int size = 0;
        for (Object obj: smartArray.toArray()) {
            if (pr.test(obj)) {
                size += 1;
            }
        }

        Object[] newArr = new Object[size];

        int counter = 0;
        for (Object obj: smartArray.toArray()) {
            if (pr.test(obj)) {
                newArr[counter] = obj;
                counter += 1;
            }
        }

        this.smartArray = new BaseArray(newArr);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray().clone();
    }

    @Override
    public String operationDescription() {
        return "Deletes elements that are not compatible with predicate";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
