class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       ArrayList<Integer> list = new ArrayList<>();
       int p1 = 0;
       while(k<=nums.length){
            int max = Arrays.stream(nums,p1,k).max().getAsInt();
            list.add(max);
            p1++;
            k++;
       } 
       return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
