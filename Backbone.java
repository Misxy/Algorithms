import java.util.Arrays;

public abstract class Backbone implements BackboneInterface {
    public static int[] prepareData() {
        return new int[] { 6, 200, 8, 6, 10 };
    }

    public void displayData(int[] arr) {
        System.out.println("An array: " + Arrays.toString(arr));
    }

}