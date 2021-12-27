public class e13_1 {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        try {
            if (!isNumber(args[0]) ||!isNumber(args[2]))
                throw new NumberFormatException("It must be a number");

            // The result of the operation
            int result = 0;
            // Determine the operator
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
            }

            // Display result
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Execution: a number ");
        }
    }

    public static boolean isNumber(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9'))
                return false;
        }
        return true;
    }
}






