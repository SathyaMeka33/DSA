class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int temp=-1;
        for(int i=1;i<=100;i++){
            if(!set.contains(k*i)) return k*i;
        }
        return k*100+1;
    }
}