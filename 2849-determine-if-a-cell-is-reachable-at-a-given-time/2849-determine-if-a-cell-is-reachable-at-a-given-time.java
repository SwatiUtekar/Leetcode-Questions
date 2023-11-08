class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xDistance = Math.abs(sx - fx);
        int yDistance = Math.abs(sy - fy);
        int minDist = Math.min(xDistance, yDistance) + Math.abs(yDistance - xDistance);
        if (minDist == 0) {
            return t != 1;
        }
        
        return t >= minDist;
    }
}