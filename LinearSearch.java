public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,1,2,20};
        int index = linearSearch(arr, 2);
        System.out.println("Index: " + index);
    }
}
