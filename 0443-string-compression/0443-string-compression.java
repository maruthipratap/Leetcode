class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        StringBuilder sb=new StringBuilder();
        int cnt=0,p1=0,p2=0;
        while(p1<n &&p2<n){
            if(chars[p1]==chars[p2]){
                cnt++;
                p2++;
            }else{
                sb.append(chars[p1]);
                if(cnt!=1)sb.append(cnt);
                p1=p2;
                cnt=0;
            }

        }
        if(cnt!=1)sb.append(chars[n-1]).append(cnt);
        else sb.append(chars[n-1]);
        int idx=0;
        for(int i=0;i<sb.length();i++){
            chars[idx++]=sb.charAt(i);
        }
        return sb.length();
    }

}