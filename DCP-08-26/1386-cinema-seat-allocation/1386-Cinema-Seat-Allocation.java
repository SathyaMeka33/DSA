class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        int r=rs.length;
        HashMap<Integer,TreeSet<Integer>> map=new HashMap<>();
        // for(int i=1;i<=n;i++){
        //     map.put(i,new TreeSet<>());
        // }
        HashSet<Integer> rows=new HashSet<>();
        for(int i=0;i<r;i++){
            if(!map.containsKey(rs[i][0])) map.put(rs[i][0],new TreeSet<>());
            map.get(rs[i][0]).add(rs[i][1]);
            rows.add(rs[i][0]);
        }
        
        int temp = (n - rows.size()) * 2;
        for(int i : rows){
            TreeSet<Integer> set=new TreeSet<>();
            set=map.get(i);
            boolean flag1=true;
            for(int j=2;j<=5;j++){
                if(set.contains(j)){
                    flag1=false;
                    break;
                }
            }

            boolean flag2=true;
            for(int j=4;j<=7;j++){
                if(set.contains(j)){
                    flag2=false;
                    break;
                }
            }

            boolean flag3=true;
            for(int j=6;j<=9;j++){
                if(set.contains(j)){
                    flag3=false;
                    break;
                }
            }

        if(flag1==true && flag3==true) temp+=2;
        else if(flag1|| flag2|| flag3) temp++;
        }
       
        return temp;
    }
}