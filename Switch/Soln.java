// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        double area;

        switch (choice) {
            case 1: // Circle
                double r = arr.get(0);
                area = Math.PI * r * r;
                return area;

            case 2: // Rectangle
                double l = arr.get(0);
                double b = arr.get(1);
                area = l * b;
                return area;

            default:
                return 0.0;
        }
    }
}
