class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1) return 1;
        int count = 0;
        boolean up = false;
        boolean down = false;
        int i = 0;
        if(nums[1] < nums[0]) {
            down = true;
            count += 2;
        }else if(nums[1] > nums[0]) {
            up = true;
            count += 2;
        }else {
            while(i < nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
            if(i < nums.length-1 && nums[i+1] > nums[i]){
                up = true;
                count += 2;
            }else if(i < nums.length-1 && nums[i+1] < nums[i]){
                down = true;
                count += 2;
            }else count++;
        }
        while(i<nums.length-1){
            if(nums[i+1] > nums[i]){
                up = true;
                if(down) count++; //taking only one down
                down = false;
            }else if(nums[i+1] < nums[i]){
                down = true;
                if(up) count++; // taking only one up
                up = false;
            }else {
                i++;
                continue;
            };
            i++;
        }
        return count;
    }
}