package org.example.tasks_02;

public class Task11 {

    public int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;
        int min;

        while (l < r) {
            if (height[l] > height[r]) {
                min = height[r];
                res = Math.max(res, (r - l) * min);
                while(height[r] <= min && l < r) r--;
            } else {
                min = height[l];
                res = Math.max(res, (r - l) * min);
                while(height[l] <= min && l < r) l++;
            }
        }

        return res;
    }

    public int maxAreaOld(int[] height) {
        int res = 0;

        int l = 0;
        int r = height.length - 1;

        while (l != r) {
            int width = r - l;
            int min = Math.min(height[r], height[l]);

            int compute = width * min;
            if (compute > res)  res = compute;

            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }

        return res;
    }
}
