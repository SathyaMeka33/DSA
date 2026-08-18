class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n ;j++){
        //         for(int q=j;q<j+k && j+k<n;q++){
        //         map.put(nums[q],map.getOrDefault(nums[q],0)+1);
        //         }
        //     }
        // }
        int p1=0;
        int p2=p1+k;
        while(p1<n && p2<=n){
            HashSet<Integer> set=new HashSet<>();
            for(int i=p1;i<p2;i++){
               set.add(nums[i]);
            }
            for(int num:set){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            p1++;
            p2++;
        }
        int max=-1;
        for(int num:map.keySet()){
            int temp=map.get(num);
            if(temp==1) max=Math.max(max,num);
            System.out.println(temp);
        }
        return max;
    }
}