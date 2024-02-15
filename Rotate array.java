class Solution {
    public void rotate(int[] nums, int k) {
    int[]temp=new int[nums.length];
    for(int i=0;i<nums.length;i++)
    {
        temp[i]=nums[i];
    }
    for(int i=0;i<nums.length;i++)
    {
        nums[(i+k)%nums.length]=temp[i];
    }
}
}


// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
