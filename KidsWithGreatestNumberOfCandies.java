import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = new KidsWithGreatestNumberOfCandies().solution(candies, extraCandies);
        System.out.println("Result: " + result);
    }

    public List<Boolean> solution(int[] candies, int extraCandies) {
        int maximumNumber = 0;
        List<Boolean> result = new ArrayList<>();
        for (int num : candies) {
            if (num > maximumNumber) {
                maximumNumber = num;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            boolean resultComparator = candies[i] + extraCandies >= maximumNumber;
            result.add(resultComparator);
        }
        return result;
    }
}
