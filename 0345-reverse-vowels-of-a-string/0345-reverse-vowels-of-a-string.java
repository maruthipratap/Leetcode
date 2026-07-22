class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int p1=0; 
        int p2=s.length()-1; 
        while(p1<p2){
            if(set.contains(ch[p1])&&set.contains(ch[p2])){
                char temp=ch[p1];
                ch[p1]=ch[p2];
                ch[p2]=temp;
                p1++;
                p2--;
            }else if(set.contains(ch[p1])){
                p2--;
            }else{
                p1++;
            }
        }
        return new String(ch);
    }
}