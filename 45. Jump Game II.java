//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150 

class Solution {
    public int jump(int[] nums) {

        int steps = 0;
        int maxReach = 0;
        int lastJumpMaxReach = 0;

        for (int i = 0; i < nums.length - 1; ++i) {

            maxReach = Math.max(maxReach, i + nums[i]);
            System.out.println("i = " + i);
            System.out.println("i + nums[i] " + (i + nums[i]));
            System.out.println("maxReach = " + maxReach);

            if (lastJumpMaxReach == i) {
                steps++;

                System.out.println("steps = " + steps);

                lastJumpMaxReach = maxReach;

                System.out.println("lastJumpMaxReach = " + lastJumpMaxReach);
                
                if (maxReach >= nums.length - 1) {
                    break;
                }

            }

        }

        return steps;

    }
}
