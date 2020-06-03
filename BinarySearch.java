public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int max = arr.length - 1;
        int min = 0;

        int guess = 0; //middle index
        int step =0; //a counter to count steps.

        while (max > min){
            guess = (max + min) / 2;
            step++;

            if(arr[guess] == target){
                System.out.println("Numbers of required step for binary search: " +step);
                return guess;
            }
            if(arr[guess] > target){
                max = guess + 1;
            }
            else{
                min = guess + 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int left, int right, int target){
        int middleInddex = (0 + ((arr.length-1)-0)) / 2;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,1,2,20};
        int index = binarySearch(arr, 2);
        System.out.println("Index: " + index);
    }
}
