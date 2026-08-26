class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int p1=0;
        int p2=0;
        int cnt=0;
        String temp="";
        boolean found=false;
        while(p1<n){
            if(cnt<k && p2<n){
                if(s.charAt(p2)=='1') cnt++;
                p2++;
            }
            else if(cnt>=k){
                  while (p1 < p2 && s.charAt(p1) == '0') {
                    p1++;
                }

                String tempo=s.substring(p1,p2);
                if(!found || temp.length()>tempo.length()){
                    temp=tempo;
                    found=true;
                }
                else if(temp.length()==tempo.length() && tempo.compareTo(temp)<0) temp=tempo;
                if(s.charAt(p1)=='1') cnt--;
                p1++;
            }
            else break;
        }
        //if(temp.equals(s)) return "";
        return temp;
    }
}