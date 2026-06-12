import java.util.*;
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder();
        Set<Character> vowels=new HashSet(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String[] words=sentence.split(" ");
        StringBuilder dup=new StringBuilder();
        for(int i=0;i<words.length;i++){
            dup.append('a');
            String temp=words[i];
            char ch=temp.charAt(0);
            if(vowels.contains(ch)){
                sb.append(temp).append("ma").append(dup).append(' ');
            }else{
                sb.append(temp.substring(1)).append(ch).append("ma").append(dup).append(' ');
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}