class Solution {
    public double angleClock(int hour, int minutes) {
        double minAngle=6.0*minutes;
        double hrAngle=(double)30*hour+0.5*minutes;
        double angle=Math.abs(hrAngle-minAngle);
        return Math.min(angle,360-angle);
    }
}