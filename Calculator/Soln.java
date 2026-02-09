class Solution {
    public void calculate(int a, int b, int operator) {
        // code here
        switch(operator){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(b-a);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
