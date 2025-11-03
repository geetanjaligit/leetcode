class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length)
            return -1;

        int st = 1, end = 0;
        for (int i : bloomDay)
            end = Math.max(end, i);

        int ans = end;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] arr, int minDay, int m, int k) {
        int mCount = 0, kCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minDay) {
                kCount++;
                if (kCount == k) {
                    mCount++;
                    kCount = 0;
                }
            } else {
                kCount = 0;
            }
        }
        return mCount >= m;
    }
}
