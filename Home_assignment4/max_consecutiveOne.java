// ⏱ Time Complexity: O(n)
// - r and l both traverse the array once.
// - Each element is processed at most twice (once by r, once by l).
// - So overall, linear time: O(n) where n = nums.length.

//  Space Complexity: O(1)
// - Only a few integer variables (maxlen, l, r, zeros) are used.
// - No extra space proportional to input size.
// - So: O(1) constant space



class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxlen=0,l=0,r=0,zeros=0;

        while(r<nums.length){
            if(nums[r]==0){
                zeros+=1;
            }
            while(zeros>k){

                if(nums[l]==0){
                    zeros--;
                    
                }
                l++;

            }
            if(zeros<=k){
                int len = r-l+1;
                maxlen=  Math.max(len,maxlen);
                r++;

            }
            
        }
        return maxlen;
        
    }
}