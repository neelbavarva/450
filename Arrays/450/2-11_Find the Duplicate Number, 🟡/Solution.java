public class Solution {
    public int findDuplicate(int[] nums) {
        for(int count=0;count<nums.length;count++){
            int number = Math.abs(nums[count]);
            if(nums[number]<0)
                return number;
            else
                nums[number] = -nums[number];
        }
        return -1;
    }
}
