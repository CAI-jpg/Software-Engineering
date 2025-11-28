/* 求解子数组之和的最大值*/
public class MaxNum {
        public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // 动态规划：当前元素要么加入前面的子数组，要么重新开始
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    /* 测试方法*/
    public static void main(String[] args) {
        // 测试用例
        int[] test1 = {1, -2, 3, 5, -1};
        int[] test2 = {1, -2, 3, -8, 5, 1};
        int[] test3 = {1, -2, 3, -2, 5, 1};
        
        System.out.println("数组[1, -2, 3, 5, -1]的最大子数组和: " + maxSubArray(test1));
        System.out.println("数组[1, -2, 3, -8, 5, 1]的最大子数组和: " + maxSubArray(test2));
        System.out.println("数组[1, -2, 3, -2, 5, 1]的最大子数组和: " + maxSubArray(test3));
        
        // 验证结果是否符合预期
        System.out.println("预期结果: 8, 6, 7");
    }
}