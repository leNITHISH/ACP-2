
class StockSpanBrute {
    static int[] calculateSpan(int[] price, int n) {

        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (price[j] <= price[i]) {
                    count++;
                } else {
                    break;
                }
            }

            span[i] = count;
        }

        return span;
    }
}
