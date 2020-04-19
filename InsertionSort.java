
public class InsertionSort extends Backbone {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.displayData(prepareData());
        int[] sortedArray = insertionSort.sortingData(prepareData());
        insertionSort.displayData(sortedArray);
    }

    @Override
    public int[] sortingData(int[] arr) {
        // TODO Auto-generated method stub
        int number = arr.length;
        for (int a = 1; a < number; a++) {
            int keyValue = arr[a];
            int previousIndex = a - 1;
            while (previousIndex >= 0 && arr[previousIndex] > keyValue) {
                arr[previousIndex + 1] = arr[previousIndex];
                previousIndex = previousIndex - 1;
            }
            arr[previousIndex + 1] = keyValue;
        }
        return arr;
    }
}