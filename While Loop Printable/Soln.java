class Solution {
    public void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            // Code here
                System.out.print(n*multiplier+" ");
                multiplier--;
        }
        System.out.println();
    }
}
