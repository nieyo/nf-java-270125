import java.util.Scanner;

public class ArrayAndForLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = {20,19,18,17,16,15,14,13,12,11};
        int[] numbersSum = new int[10];

        for(int number : numbers) {
            System.out.println(number);
        }
        System.out.println("-----");

        int sum = 0;
        int highestNumber = 0;

        // find shorter array to prevent ArrayIndexOutOfBoundsException
        // numbers.length < numbers2.length ? int index = numbers.length : int index = numbers2.length

        for (int i = 0; i < numbers.length; i++) {
            // sum
            sum += numbers[i];
            // highest number
            if(numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
            // addition of arrays
            numbersSum[i] = numbers[i] + numbers2[i];
        }


        System.out.println("sum: " + sum);
        System.out.println("highest number: " + highestNumber);
        System.out.println("-----");

        for(int number : numbersSum) {
            System.out.println(number);
        }
        System.out.println("-----");

        // Bonus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Wort ein:");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input);

        char[] zeichenArray = input.toCharArray();

        for (char zeichen : zeichenArray) {
            System.out.println(zeichen);
        }
    }
}
