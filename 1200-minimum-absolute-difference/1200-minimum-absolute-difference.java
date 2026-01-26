class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        int minVal=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            minVal=Math.min(minVal,arr[i]-arr[i-1]);
        }
        for(int i=1;i<n;i++){
            if(minVal==arr[i]-arr[i-1]){
                List<Integer> crnt=new ArrayList<>();
                crnt.add(arr[i-1]);
                crnt.add(arr[i]);         
                ans.add(crnt);
            }
        }
        //Collections.sort(ans,(a,b)-> a.get(0)-b.get(0));
        return ans;
    }
}