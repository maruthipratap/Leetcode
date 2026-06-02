class Trie {
    Trie[] child;
    boolean isEnd;
    
    public Trie() {
        child=new Trie[26];
        isEnd=false;
    }
    
    public void insert(String word) {
        Trie r=this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(r.child[idx]==null){
                r.child[idx]=new Trie();
            }
            r=r.child[idx];
        }
        r.isEnd=true;
        
    }
    
    public boolean search(String word) {
        Trie r=this;//r is temp
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(r.child[idx]==null)return false;
            r=r.child[idx];
        }
        return r.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Trie r=this;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(r.child[idx]==null)return false;
            r=r.child[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */