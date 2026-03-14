public class BinaryTriangle {
    public static void main(String[] args) {
        int rows = 6; // Number of rows to print

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Logic: If the sum of row (i) and column (j) is even, print 1
                // This ensures the alternating 0s and 1s pattern.
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}