//https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canJump(int[] nums) {

        Boolean traversable = false;

        int max = 0;

        for(int i = 0; i< nums.length-1; i++) {

            if(max < i) {
                return false; 
            }
            int temp = nums[i];
            System.out.println("temp = " + temp);
            if (i + temp > max ) {
               max = i + temp;
            System.out.println("max = "+ max);    
            }       
        }

        if(max >= nums.length -1) {
            traversable = true; 
        }




        return traversable;

    }
}
