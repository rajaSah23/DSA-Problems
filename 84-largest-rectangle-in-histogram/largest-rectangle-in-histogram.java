class Solution {
    public int largestRectangleArea(int[] heights) {
        // 1.Brute force: O(n*n)
        // 2.using Stack: O(n)
        // i. Find left smallest element indexes/array
        // ii. Find right Smallest element indexes/array
        // iii. use formula to find area of rectangle
        Stack<Integer> stk = new Stack<>();
        // i. left smallest indexes
        int[] leftSmallest = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                leftSmallest[i] = -1;
                stk.push(i);
            } else {
                leftSmallest[i] = stk.peek();
                stk.push(i);
            }
        }
        // ii. right smallest indexes
        stk.clear();
        int[] rightSmallest = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                rightSmallest[i] = heights.length;
                stk.push(i);
            } else {
                rightSmallest[i] = stk.peek();
                stk.push(i);
            }
        }

        // Finding largest area rectangle
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int breadth = rightSmallest[i] - leftSmallest[i] - 1;
            int area = height * breadth;

            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}