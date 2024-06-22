class tohSolution {
    static int count = 0;

    public static void toh(int n, String src, String help, String dest) {
        if (n == 1) {
            count++;
            System.out.println("Step " + count + ": Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        toh(n-1, src, dest, help);

        count++;
        System.out.println("Step " + count + ": Transfer disk " + n + " from " + src + " to " + dest);

        toh(n-1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 2;  
        toh(n, "A", "B", "C");
        System.out.println("Total number of steps: " + count);
    }
}
