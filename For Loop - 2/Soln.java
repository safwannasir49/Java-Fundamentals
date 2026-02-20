class Solution {
    public void printEvenIndices(String s) {
        // code here
        for(int i=0;i<s.length();i+=2){
            
            System.out.print(s.charAt(i));
            
        }
    }
}
