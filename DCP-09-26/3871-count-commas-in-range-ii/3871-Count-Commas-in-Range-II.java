class Solution {
    public long count(long n){
        long count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public long countCommas(long n) {
        long ans=0;
        long count=0;
        long fans=0;
        if(n<1000) return 0;
        for(long i=1000;i<=n;i=i*1000){
            long end=i*1000-1;
            ans=Math.min(end,n);
            count=ans-i+1;
            fans+=count*((count(i)-1)/3);
        }
        return fans;
    }
}