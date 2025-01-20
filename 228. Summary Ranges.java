#https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            StringBuilder sb = new StringBuilder();

            int start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            int end = nums[i];

            sb.append(start);

            if (start != end) {
                sb.append("->").append(end);

            }

            result.add(sb.toString());
        }

        return result;

    }
}
