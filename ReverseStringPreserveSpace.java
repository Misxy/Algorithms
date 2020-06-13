public class ReverseStringPreserveSpace {
    public static void main(String[] args) {
        String str = "abc de";
        ReverseStringPreserveSpace reverseStringPreserveSpace = new ReverseStringPreserveSpace();
        System.out.println("Original input: " + str);
        reverseStringPreserveSpace.reverseString(str);
    }

    public void reverseString(String str) {
        char[] input = str.toCharArray();
        char[] result = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                result[i] = ' ';
            }
        }
        int j = result.length - 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = input[i];
                j--;
            }
        }
        System.out.println("Reversed preserve space word: " + String.valueOf(result));
    }
}
