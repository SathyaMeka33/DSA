class Solution {
    public String binary(char ch){
        String s=Integer.toBinaryString(ch-'a'+97);
        while(s.length()<8){
            s="0"+s;
        }
        return s.toString();
    }
    public boolean isPalindromic(String s) {
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++){
            s1+=binary(s.charAt(i));
        }
         int p1=0;
        int p2=s1.length()-1;
        System.out.println(s1);
        while(p1<=p2){
            if(((s1.charAt(p1))!=(s1.charAt(p2)))) return false;
            p1++;
            p2--;
        }
        return true;
    }
}