class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (p1 < n && p2 < n) {
            map.put(nums[p2], map.getOrDefault(nums[p2], 0) +1);
           
            while(map.get(nums[p2]) > k) {
                
                map.put(nums[p1],map.getOrDefault(nums[p1],0)-1);
                if(map.get(nums[p1])<0) map.remove(nums[p1]);
                p1++;
                 
            }
            max = Math.max(max, p2 - p1+1);
            p2++;
        }
        return max;
    }
}