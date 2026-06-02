class Solution {
    class Trie{
        Trie[] child;
        int c;
        Trie(){
            child=new Trie[26];
            c=0;
        }
        void insert(Trie r, String w){
            Trie temp=r;
            for(int i=0;i<w.length();i++){
                int idx=w.charAt(i)-'a';
                if(r.child[idx]==null){
                    r.child[idx]=new Trie();
                }
                r=r.child[idx];
                r.c++;
            }
        }
        int search(Trie r, String st){
            int ans=0;
            for(int i=0;i<st.length();i++){
                int idx=st.charAt(i)-'a';
                r=r.child[idx];
                ans+=r.c;
            }
            return ans;
        }
    }
    public int[] sumPrefixScores(String[] words) {
        Trie r=new Trie();
        for(String s: words){
            r.insert(r,s);
        }
        int[] ans= new int[words.length];
        for(int i=0;i<words.length;i++){
            ans[i]=r.search(r,words[i]);
        }
        return ans;
    }
}