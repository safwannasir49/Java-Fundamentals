class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        
        boolean aANDb = a&&b;
        boolean aORb = a||b;
        boolean NOTa = !a;
        
        return aANDb + " " + aORb+ " " + NOTa;
    }
}
