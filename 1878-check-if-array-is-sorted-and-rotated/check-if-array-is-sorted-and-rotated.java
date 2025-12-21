class Solution {
    public boolean check(int[] nums) {
        int countbreak = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
             countbreak += 1;
            }
        }    
            if(nums[nums.length-1] > nums[0]){
              countbreak += 1;
            }
        return countbreak <= 1;
    }
}