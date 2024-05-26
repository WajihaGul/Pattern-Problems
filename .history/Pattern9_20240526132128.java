class Pattern9 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 1; cols <= n - rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Solution(5);
    }
}
