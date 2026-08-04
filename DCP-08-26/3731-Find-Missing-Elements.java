class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)) arr.add(i);
        }
        return arr;
    }
}