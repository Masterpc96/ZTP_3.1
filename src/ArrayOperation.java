import java.util.Random;

public class ArrayOperation {
    int[] arr;

    public ArrayOperation() {
        Random rd = new Random(); // creating Random object
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }
    }

    public int getOutOfBoundsElement() {
        int temp = 0;
        try {
            temp = arr[6];
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return temp;
    }

    public int getFirstElement() {
        int temp = 0;
        temp = arr[0];
        return temp;
    }

    public double getOutOfBoundsElementWithException() throws ArrayIndexOutOfBoundsException {
        int temp = 0;
        temp = arr[0];
        return temp;
    }
}
