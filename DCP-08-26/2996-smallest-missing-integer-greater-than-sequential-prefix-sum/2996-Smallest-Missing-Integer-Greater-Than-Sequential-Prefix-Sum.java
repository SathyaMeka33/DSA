class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0]+1;
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<n;i++){
            set.add(nums[i]);
        }
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int cnt=0;
            if((nums[i]-nums[i-1])==1){
                cnt++;
                ans=ans+nums[i];
            }
            else break;
        }
        for(int i=ans;i<=2500;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}