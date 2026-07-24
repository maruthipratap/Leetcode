class Solution {
    public String lastNonEmptyString(String s) {
        /*StringBuilder sb=new StringBuilder(s);
        StringBuilder ans=new StringBuilder();
        while(!sb.isEmpty()){
            Set<Character> set=new HashSet<>();
            int idx=0;
            ans.setLength(0);
            while(idx<sb.length()){
                if(set.contains(sb.charAt(idx))){
                    idx++;
                }else{
                    ans.append(sb.charAt(idx));
                    set.add(sb.charAt(idx));
                    sb.deleteCharAt(idx);
                    //idx++;
                }
            }
        }*/ 
        int[] freq=new int[26];
        int[] last=new int[26];
        int max=0;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            freq[idx]++;
            last[idx]=i;
            max=Math.max(max,freq[idx]);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(freq[idx]==max && last[idx]==i){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}