class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int idx=0;
        for(int i=lower;i<=upper;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            while (idx < n && nums[idx] < i) {
                idx++;
            }
            if (idx < n && nums[idx] == i) {
                continue;
            }
            int j = i;
            while (j <= upper && (idx >= n || nums[idx] > j)) {
                arr.add(j);
                j++;
            }
            if (!arr.isEmpty()) {
                list.add(arr);
                i = j - 1;
            }
        }
        int m=list.size();
        List<List<Integer>> arr1=new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> lst=new ArrayList<>();
            int len=list.get(i).size();
            lst.add(list.get(i).get(0));
            lst.add(list.get(i).get(len-1));
            arr1.add(lst);
        }
        return arr1;
    }
}