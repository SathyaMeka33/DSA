class Solution {
    public int distinctSubseqII(String s) {
        int n=s.length();
        long mod=(long)1e9+7;
        int end[]=new int[26];
        int oldTotal=0;
        int total=0;
        //char s1[]=new char[n];
        int newSubsequence=0;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            oldTotal=total;
            newSubsequence=(int)((oldTotal+1-end[idx]+mod)%mod);
            total=(int)((total+newSubsequence)%mod);
            end[idx]=(int)((end[idx]+newSubsequence)%mod);
        }
        return total;
        
    }
}