class Solution {
    List<Integer>[] graph;
    boolean[] vis;
    int edge;
    int nodes;
    public int countCompleteComponents(int n, int[][] edges) {
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] e:edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                nodes=0;
                edge=0;
                dfs(i);
                edge/=2;
                if(edge== nodes*(nodes-1)/2){
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int node){
        vis[node]=true;
        nodes++;
        edge+=graph[node].size();
        for(int val: graph[node]){
            if(!vis[val]){
                dfs(val);
            }
        }
    }
}