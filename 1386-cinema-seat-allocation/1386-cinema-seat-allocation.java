class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int[] seat : reservedSeats){

            int row = seat[0];
            int col = seat[1];

            map.putIfAbsent(row, new HashSet<>());
            map.get(row).add(col);
        }

        int ans = (n - map.size()) * 2;

        for(int row : map.keySet()){

            Set<Integer> set = map.get(row);

            boolean left = true;
            boolean right = true;
            boolean middle = true;

            for(int i = 2; i <= 5; i++){
                if(set.contains(i)){
                    left = false;
                }
            }

            for(int i = 6; i <= 9; i++){
                if(set.contains(i)){
                    right = false;
                }
            }

            for(int i = 4; i <= 7; i++){
                if(set.contains(i)){
                    middle = false;
                }
            }

            if(left && right){
                ans += 2;
            }
            else if(left || right || middle){
                ans += 1;
            }
        }

        return ans;
    }
}