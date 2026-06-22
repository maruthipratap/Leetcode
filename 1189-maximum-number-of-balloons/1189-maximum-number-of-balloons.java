class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]=new int[26];
        int cnt=0;
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)-'a']++;
            
        }
        
        while(true){
            if(freq[0]>=1 && freq[1]>=1 && freq[11]>=2 && freq[14]>=2 && freq[13]>=1){
                cnt++;
                freq[0]-=1 ; freq[1]-=1 ; freq[11]-=2 ; freq[14]-=2 ; freq[13]-=1;
            }else{
                break;
            }
        }
        return cnt;
    }
}