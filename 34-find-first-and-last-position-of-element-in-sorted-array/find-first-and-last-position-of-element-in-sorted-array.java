public class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        if (arr == null || arr.length == 0) return ans;

        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] < target) l = m + 1;
            else r = m;
        }

        if (arr[l] != target) return ans;
        ans[0] = l;

        r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l + 1) / 2;
            if (arr[m] > target) r = m - 1;
            else l = m;
        }
        ans[1] = l;
         return ans;
      
    }
}

      