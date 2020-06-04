public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String text1 = "AGGTAB";
        String text2 = "GXTXAYB";
        char[] cText1 = text1.toCharArray();
        char[] cText2 = text2.toCharArray();
        int m = cText1.length;
        int n = cText2.length;
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        System.out.println("Longest Common Subsequence is: " + longestCommonSubsequence.findLCSRecursive(cText1, cText2, m, n));
        System.out.println("Longest Common Subsequence is: " + longestCommonSubsequence.findLCSDP(cText1, cText2, m, n));
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private int findLCSRecursive(final char[] x, final char[] y, final int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (x[m - 1] == y[n - 1]) {
            return 1 + findLCSRecursive(x, y, m - 1, n - 1);
        } else {
            return max(findLCSRecursive(x, y, m - 1, n), findLCSRecursive(x, y, m, n - 1));
        }
    }

    private int findLCSDP(final char[] x, final char[] y, final int m, final int n){
        int l [][] = new int[m+1][n+1];

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    l[i][j] = 0;
                } else if (x[i - 1] == y[j - 1]) {
                    l[i][j] = 1 + l[i - 1][j - 1];
                } else {
                    l[i][j] = max(l[i - 1][j], l[i][j - 1]);
                }
            }
        }
        return l[m][n];
    }
}

