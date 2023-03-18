package ca.bcit.comp1510.lab07;

/**
 * DebugStar file.
 * 
 * @author soheehwang
 * @version 2023
 */
public class DebugStar {

    /**
     * Description.
     * @param args
     *          unused.
     */
    public static void main(String[] args) {
        run("+", 6, 7);
        run("-", 6, 7);
        run("+", 6);
    }

    public static Operation getOperation(final String key) {
        final Operation operation;
        if (key.equals("+")) {
            operation = new Add();
        } else {
            operation = new Subtract();
        }
        return operation;
    }

    public static void run(final String key, final int a, final int b) {
        final Operation operation = getOperation(key);
        final int result = operation.perform(a, b);
        System.out.println("result = " + result);
    }

    public static void run(final String key, final int n) {
        final Factorial factorial = new Factorial();
        final int result = factorial.perform(n);
        System.out.println("result = " + result);
    }

    interface Operation {
        int perform(int a, int b);
    }

    static class Add implements Operation {
        @Override
        public int perform(final int a, final int b) {
            return (a + b);
        }
    }

    static class Subtract implements Operation {
        @Override
        public int perform(final int a, final int b) {
            return (a - b);
        }
    }

    static class Factorial {
        int perform(final int n) {
            int ret = 1;
            for (int i = 1; i <= n; i++) {
                ret *= i;
            }
            return ret;
        }
    }
}
