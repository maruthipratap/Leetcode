class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i=0;i<coordinates.length-2;i++){
            int x1=coordinates[i][0];
            int x2=coordinates[i+1][0];
            int x3=coordinates[i+2][0];
            int y1=coordinates[i][1];
            int y2=coordinates[i+1][1];
            int y3=coordinates[i+2][1];
            double m1=((x2-x1)*(y3-y2))*1.0;
            double m2=((x3-x2)*(y2-y1))*1.0;
            if(m1!=m2) return false;
        }
        return true;
    }
}