import java.util.Arrays;

public class finalpricewithdis {
    public int[] finalprices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;
    }

    public static void main(String[] args) {
        finalpricewithdis fpwd = new finalpricewithdis();
        int[] prices = { 8, 4, 6, 2, 3 };
        int[] result = fpwd.finalprices(prices);
        System.out.println(Arrays.toString(result)); // Output: [4, 2, 4, 2, 3]
    }
}
