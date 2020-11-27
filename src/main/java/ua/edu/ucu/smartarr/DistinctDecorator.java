package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);

        // Get size
        Object[] inputArray = this.smartArray.toArray();
        int size = 0;
        for (int i = 0; i < inputArray.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < i; j++) {
                if (inputArray[i].equals(inputArray[j])) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) {
                size++;
            }
        }

        // Create new Array to hold data
        Object[] newArr = new Object[size];

        // Same Iteration process
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < i; j++) {
                if (inputArray[i].equals(inputArray[j])) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) {
                newArr[counter] = inputArray[i];
                counter++;
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
        return "Deletes duplicates from Array";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
