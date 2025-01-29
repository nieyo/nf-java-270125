public class IfAndMethod {
    public static void main(String[] args){
        int aInt = -2;
        int bInt = 5;
        double aDouble = 2.2;
        double bDouble = 5.6;



        // Add, Overloading
        System.out.println("-2 + 5 = " + add(aInt, bInt));
        System.out.println("2.2 + 5.6 = " + add(bDouble, bDouble));

        // Subtract
        System.out.println("-2 - 5 = " + subtract(aInt, bInt));

        // Make Positive
        System.out.println("-2 (pos) " + makePositive(aInt));
        System.out.println("5 (pos) " + makePositive(bInt));

        // Bonus
        if (aInt > bInt){
            System.out.println("-2 - 5 = " + subtract(aInt, bInt) + " | a > b");
        } else {
            System.out.println("-2 + 5 = " + add(aInt, bInt) + " | a < b");
        }

        // Odd, Even
        System.out.println("-2 (checkEven) " + checkEven(aInt));
        System.out.println("5 (checkEven) " + checkEven(bInt));

        // Palindrome
        String aString = "Lagerregal";
        String bString = "Computer";
        System.out.println("Lagerregal " + isPalindrome(aString));
        System.out.println("Computer " + isPalindrome(bString));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int makePositive(int a) {
        // return a < 0 ? -a : a;
        // condition ? value_if_true : value_if_false
        if (a < 0){
            return -a;
        } else {
            return a;
        }
    }
    // Bonus
    public static int checkEven(int a) {
        if (a % 2 == 0){
            return a;
        } else {
            return a * 2;
        }
    }

    private static boolean isPalindrome(String a) {
        a = a.toLowerCase();
        String reversed = new StringBuilder(a).reverse().toString();
        return a.equals(reversed);
    }

}
