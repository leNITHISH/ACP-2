
class MaxSlidingWindowBrute {
    static int[] maxSlidingWindow(int[] arr, int n, int k) {

        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            result[i] = max;
        }

        return result;
    }
}
