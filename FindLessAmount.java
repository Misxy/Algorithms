import java.util.Arrays;

public class FindLessAmount {

    public int[] countNumberOfLessThanIts(int[] n){
        int[] arr = new int[n.length];
        int counter = 0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                if(n[j]<n[i] && j != i){
                    counter += 1;
                }
            }
            arr[i] = counter;
            counter = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] data = {8,8,8,8};
        FindLessAmount uglyNumbers = new FindLessAmount();
        System.out.println(Arrays.toString(uglyNumbers.countNumberOfLessThanIts(data)));
    }
}
