public class CoinChange {
    public static void main(String[] args) {
        int remaining = 8;
        int[] currencies = {2, 4};
        CoinChange coinChange = new CoinChange();
        System.out.println("Solution 1: Recursive method");
        System.out.println(
                "Number of ways we can pay using given currencies are : " +
                        coinChange.changeCoin(0, remaining, currencies, ""));
    }

    public int changeCoin(int ci, int remaining, int[] currencies, String paid) {
        if (remaining == 0) {
            System.out.println(paid);
            return 1;
        }
        if (remaining < 0) {
            return 0;
        }
        int result = 0;
        for (int i = ci; i < currencies.length; i++) {
            result += changeCoin(i, remaining - currencies[i], currencies, paid + Integer.toString(currencies[i]) + ", ");
        }
        return result;
    }

}
