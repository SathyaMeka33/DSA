class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            int n1=arr1.size();
            int n2=arr2.size();
            if(arr1.get(n1-1)>arr2.get(n2-1)) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        //int ans[]=new int[n];
        int k=0;
        for(int i=0;i<arr1.size();i++){
            nums[k]=arr1.get(i);
            k++;
            //System.out.println(nums[i]);
        }
        for(int i=0;i<arr2.size();i++){
             nums[k]=arr2.get(i);
            k++;
        }
        return nums;
    }
}