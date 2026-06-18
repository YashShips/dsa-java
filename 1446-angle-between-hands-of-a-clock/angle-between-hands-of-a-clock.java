class Solution {
    public double angleClock(int hour, int minutes) {
        double minAngle = minutes * 6;
        double hourAngle = (hour % 12) * 30 + 0.5 * minutes;
        double diff = Math.abs(hourAngle - minAngle);
        return Math.min(diff, 360 - diff);
    }
}