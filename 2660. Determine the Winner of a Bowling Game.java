//https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/
class Solution {
    public int isWinner(int[] player1, int[] player2) {

        int sum1 = player1[0];
        int sum2 = player2[0];
        for(int i = 1;i<player1.length;i++)
        {
            if(player1[i-1]==10 || (i>1 && player1[i-2]==10))
            {
                    sum1+=player1[i]*2;
            }
            else
            {
                sum1+=player1[i];
            }
            if(player2[i-1]==10 || (i>1 && player2[i-2]==10))
            {
                    sum2+=player2[i]*2;
            }
            else
            {
                sum2+=player2[i];
            }
        }

        if(sum1==sum2)
        {
            return 0;
        }
        return sum1>sum2? 1 : 2; 
        
    }
}
// time complexity - O(n), space complexity - O(1)
