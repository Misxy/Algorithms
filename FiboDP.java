import java.util.Arrays;

public class FiboDP {
    private final int maxNumber = 100;
    private final int[] lookUpTable = new int[maxNumber];
    private final int NIL = -1;

    public static void main(String[] args) {
        int n = 8;
        FiboDP fiboDP = new FiboDP();
        fiboDP.initElement();
        System.out.println("Result is: " + fiboDP.findFiboMemoization(n));
    }

    public void initElement() {
        Arrays.fill(lookUpTable, NIL);
    }

    public int findFiboTabulation(int n){
        lookUpTable[0] = 0;
        lookUpTable[1] = 1;
        for(int i=0;i<n;i++){
            lookUpTable[n] = lookUpTable[n-1] + lookUpTable[n-2];
        }
        return lookUpTable[n];
    }
    public int findFiboMemoization(int n) {
        if (lookUpTable[n] == NIL) {
            if (n <= 1) {
                lookUpTable[n] = n;
            } else {
                lookUpTable[n] = findFiboMemoization(n - 1) + findFiboMemoization(n - 2);
            }
        }
        return lookUpTable[n];
    }
}
