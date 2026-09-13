class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1) return 1;
        int count = 1;
        boolean up = false;
        boolean down = false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] > nums[i]){
                up = true;
                if(down && i==0) count += 2;
                else if(down) count++; //taking only one down
                down = false;
            }else if(nums[i+1] < nums[i]){
                down = true;
                if(up && i==0) count += 2;
                else if(up) count++; // taking only one up
                up = false;
            }else  continue;
        }
        if(!down && !up) return count;
        return count + 1;
    }
}