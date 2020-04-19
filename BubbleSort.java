public class BubbleSort extends Backbone {

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        ob.displayData(prepareData());
        int[] sortedArray = ob.sortingData(prepareData());
        ob.displayData(sortedArray);
    }

    @Override
    public int[] sortingData(int[] arr) {
        // TODO Auto-generated method stub
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}