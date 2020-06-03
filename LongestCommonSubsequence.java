import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {
    private String text1, text2;

    public LongestCommonSubsequence(final String text1, final String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence(text1, text2);
        System.out.println("Longest Common Subsequence is: " + longestCommonSubsequence.findLCS());
    }

    private Map<String, Integer> findLCS() {
        String[] splitText1 = text1.split("");
        Map<String, Integer> lookUpMap = new HashMap<>();
        String template = "";
        int result = 0;

        for(int i=0;i<splitText1.length;i++){
            if(text2.contains(splitText1[i])){
                result += 1;
                template += splitText1[i];
            }
        }
        lookUpMap.put(template, result);
        return lookUpMap;
    }
}

