class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> hp = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(hp.contains(nums[i])) return true;
            hp.add(nums[i]);
        }
        return false; 
    }
}