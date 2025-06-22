package org.example;

public class Task42 {

    public int trap(int[] height) {
        int water = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int i = 1;
            int hSum = 0;

            if (height[l] <= height[r]) {
                while (height[l] > height[l + i]) {
                    hSum += height[l + i];
                    i++;
                }
                water += height[l] * (i - 1) - hSum;
                l = l + i;
            } else {
                while (height[r] > height[r - i]) {
                    hSum += height[r - i];
                    i++;
                }
                water += height[r] * (i - 1) - hSum;
                r = r - i;
            }
        }

        return water;
    }
}
