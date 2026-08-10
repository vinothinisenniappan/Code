class Solution {
    public double angleClock(int hour, int minutes) {
            double hours = hour*30 + minutes*0.5;
            double min = minutes*6;
            double value = Math.abs(hours-min);
            return Math.min(value,360-value);
    }
}