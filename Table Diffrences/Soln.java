class Solution {
    public static void difference(int n1, int n2) {
        
        int diff = n1 - n2;
        
        for(int i = 1; i <= 10; i++){
            System.out.print(diff * i + " ");
        }
    }
}
