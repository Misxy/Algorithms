import java.util.Arrays;

public class ReArrangeString {
    public static void main(String[] args) {
        String word = "I love programing language";
        ReArrangeString reArrangeString = new ReArrangeString();
        System.out.println("Input word: " + word);
        reArrangeString.reverseString(word);
    }

    private void reverseString(String word) {
        String[] splitWord = word.split(" ");
        String result = "";
        for(int i=splitWord.length-1;i>=0;i--){
            result += splitWord[i]+ " ";
        }
        System.out.println("Reversed word: " + result);
    }
}

