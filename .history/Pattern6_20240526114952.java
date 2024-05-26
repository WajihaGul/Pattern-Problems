class Pattern6 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int col = 0; col < n - rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution(5);
    }
}