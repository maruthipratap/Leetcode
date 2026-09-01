class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        //int cnt=0;
        int l=0;
        int r=n-1;
        int boats=0;
        while(l<=r){
            //sum+=people[p1];
            if(people[l]+people[r]<=limit){ 
                l++;
            }
            r--;
            boats++;
        }
        
        return boats;
    }
}