public class PrimeValues {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("PrimeValues <n>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);

        if (n < 1) {
            System.out.println("Enter a positive int, greater than 0.");
            System.exit(1);
        }
        System.out.println("Print values from 1 to" + n + "PRIME");

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + "Prime");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

